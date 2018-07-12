package br.com.transire.commerce.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.transire.commerce.entidades.Produto;
import br.com.transire.commerce.servicos.ProdutoService;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ApiControle {

    private ProdutoService produtoService;

    @Autowired
    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
	
    @GetMapping("/produtos")
    public Iterable<Produto> listAllProdutos() {
        return produtoService.listAllProdutos();
    }
    
    @GetMapping("/produto/{id}")
    public Produto getProdutoById(@PathVariable(value = "id") int id) {
        return  produtoService.getProdutoById(id);
    }
    
    @PostMapping("/produto/novo")
    public Produto saveProduto(@Valid @RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        produtoService.deleteProduto(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/produto/{id}")
    public Produto updateProduto(@PathVariable(value = "id") int id,
                                            @Valid @RequestBody Produto produto) {

    	Produto produtoAtualizado = produtoService.getProdutoById(id);

    	produtoAtualizado.setProdutoId(produto.getProdutoId());
    	produtoAtualizado.setName(produto.getName());
    	produtoAtualizado.setPrice(produto.getPrice());
    	
        return produtoService.saveProduto(produtoAtualizado);
    }
    
}
