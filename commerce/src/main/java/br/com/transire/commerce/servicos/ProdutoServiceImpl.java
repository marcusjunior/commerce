package br.com.transire.commerce.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transire.commerce.entidades.Produto;
import br.com.transire.commerce.repositorios.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    public void setProdutoRepository(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Iterable<Produto> listAllProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto getProdutoById(Integer id) {
        return produtoRepository.findOne(id);
    }

    @Override
    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteProduto(Integer id) {
        produtoRepository.delete(id);
    }

}
