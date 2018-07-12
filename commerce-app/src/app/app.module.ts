import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProdutoComponent } from './produto/produto.component';
import { AppRoutingModule } from './app.routing.module';
import {ProdutoService} from './produto/produto.service';
import {HttpClientModule} from "@angular/common/http";
import {AddProdutoComponent} from './produto/add-produto.component';

@NgModule({
  declarations: [
    AppComponent,
    ProdutoComponent,
    AddProdutoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProdutoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
