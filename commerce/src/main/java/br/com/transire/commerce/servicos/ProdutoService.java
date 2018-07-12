package br.com.transire.commerce.servicos;

import br.com.transire.commerce.entidades.Produto;

public interface ProdutoService {

    Iterable<Produto> listAllProdutos();

    Produto getProdutoById(Integer id);

    Produto saveProduto(Produto product);

    void deleteProduto(Integer id);

}
