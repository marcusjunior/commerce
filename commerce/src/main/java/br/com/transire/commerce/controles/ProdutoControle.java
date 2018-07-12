package br.com.transire.commerce.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.transire.commerce.entidades.Produto;
import br.com.transire.commerce.servicos.ProdutoService;

@Controller
public class ProdutoControle {

    private ProdutoService produtoService;

    @Autowired
    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @RequestMapping(value = "/produtoLista", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("produtos", produtoService.listAllProdutos());
        System.out.println("Returning rpoducts:");
        return "produtoLista";
    }

    @RequestMapping("produto/{id}")
    public String showProduto(@PathVariable Integer id, Model model) {
        model.addAttribute("produto", produtoService.getProdutoById(id));
        return "produtoView";
    }

    @RequestMapping("produto/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("produto", produtoService.getProdutoById(id));
        return "produtoForm";
    }

    @RequestMapping("produto/novo")
    public String newProduto(Model model) {
        model.addAttribute("produto", new Produto());
        return "produtoForm";
    }

    @RequestMapping(value = "produto", method = RequestMethod.POST)
    public String saveProduto(Produto produto) {
        produtoService.saveProduto(produto);
        return "redirect:/produto/" + produto.getId();
    }

    @RequestMapping("produto/delete/{id}")
    public String delete(@PathVariable Integer id) {
        produtoService.deleteProduto(id);
        return "redirect:/produtoLista";
    }

}
