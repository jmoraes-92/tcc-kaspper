import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { OrcamentosModule } from './orcamentos/orcamentos.module'; // Importa o OrcamentosModule
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent, // Apenas o AppComponent é declarado aqui
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    OrcamentosModule, // Importa o módulo de Orçamentos, que contém o FormularioComponent
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
