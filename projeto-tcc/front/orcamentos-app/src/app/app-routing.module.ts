import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaComponent } from './orcamentos/lista/lista.component';
import { FormularioComponent } from './orcamentos/formulario/formulario.component';

const routes: Routes = [
  { path: '', redirectTo: 'orcamentos', pathMatch: 'full' },
  { path: 'orcamentos', component: ListaComponent },
  { path: 'orcamentos/novo', component: FormularioComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
