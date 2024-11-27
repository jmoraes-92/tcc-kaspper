import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatOptionModule } from '@angular/material/core';
import { MatButtonModule } from '@angular/material/button';
import { MatTableModule } from '@angular/material/table';


import { FormularioComponent } from './formulario/formulario.component';
import { ListaComponent } from './lista/lista.component';

@NgModule({
  declarations: [
    FormularioComponent,
    ListaComponent,
  ],
  imports: [
    CommonModule,
    MatTableModule, // Necessário para mat-table
    FormsModule, // Necessário para [(ngModel)]
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatOptionModule,
    MatButtonModule,
  ],
  exports: [
    FormularioComponent,
    ListaComponent,
  ],
})
export class OrcamentosModule {}
