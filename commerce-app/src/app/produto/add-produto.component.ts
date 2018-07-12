import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Produto } from '../models/produto.model';
import { ProdutoService } from './produto.service';

@Component({
  templateUrl: './add-produto.component.html'
})
export class AddProdutoComponent {

  produto: Produto = new Produto();

  constructor(private router: Router, private produtoService: ProdutoService) {

  }

  createProduto(): void {
    this.produtoService.createProduto(this.produto)
        .subscribe( data => {
          alert("Produto criado com sucesso.");
        });

  };

}
