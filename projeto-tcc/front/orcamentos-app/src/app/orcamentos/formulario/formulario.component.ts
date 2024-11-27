import { Component } from '@angular/core';
import { BackendService } from '../../services/backend.service'; // Certifique-se de que o caminho está correto

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
})
export class FormularioComponent {
  demanda: any = {
    descricao: '',
    prioridade: '',
  };

  constructor(private backendService: BackendService) {}

  salvarDemanda(): void {
    if (this.demanda.descricao && this.demanda.prioridade) {
      this.backendService.saveDemanda(this.demanda).subscribe({
        next: () => {
          console.log('Demanda salva com sucesso!');
          alert('Demanda salva com sucesso!');
          this.resetarFormulario();
        },
        error: (err) => {
          console.error('Erro ao salvar a demanda:', err);
          alert('Erro ao salvar a demanda. Tente novamente.');
        },
      });
    } else {
      alert('Por favor, preencha todos os campos do formulário.');
    }
  }

  resetarFormulario(): void {
    this.demanda = {
      descricao: '',
      prioridade: '',
    };
  }
}
