package br.com.transire.commerce.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.com.transire.commerce.entidades.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
