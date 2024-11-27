import { Component, OnInit } from '@angular/core';
import { BackendService } from '../../services/backend.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
})
export class ListaComponent implements OnInit {
  displayedColumns: string[] = ['coluna1', 'coluna2'];
  dataSource: any[] = []; // Inicialize como array vazio

  constructor(private backendService: BackendService) {}

  ngOnInit(): void {
    this.backendService.listarOrcamentos().subscribe({
      next: (data) => {
        this.dataSource = data;
      },
      error: (err) => {
        console.error('Erro ao carregar os orçamentos:', err);
      },
    });
  }
}
