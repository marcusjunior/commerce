import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Produto } from '../models/produto.model';
import { ProdutoService } from './produto.service';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styles: []
})
export class ProdutoComponent implements OnInit {

  produtos: Produto[];

  constructor(private router: Router, private produtoService: ProdutoService) {

  }

  ngOnInit() {
    this.produtoService.getProdutos()
      .subscribe( data => {
        this.produtos = data;
      });
  };

  deleteProduto(produto: Produto): void {
    this.produtoService.deleteProduto(produto)
      .subscribe( data => {
        this.produtos = this.produtos.filter(u => u !== produto);
      })
  };

}
