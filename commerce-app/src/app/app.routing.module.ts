import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ProdutoComponent } from './produto/produto.component';
import {AddProdutoComponent} from './produto/add-produto.component';

const routes: Routes = [
  { path: 'produtos', component: ProdutoComponent },
  { path: 'add', component: AddProdutoComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
