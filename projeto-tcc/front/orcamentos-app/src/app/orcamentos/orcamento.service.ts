import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrcamentoService {
  private apiUrl = 'http://localhost:8080/api'; // URL base do backend

  constructor(private http: HttpClient) {}

  // Método para salvar uma demanda e gerar estimativa
  salvarDemanda(demanda: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/demandas`, demanda);
  }

  // Método para listar todas as demandas e seus orçamentos
  listarOrcamentos(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/orcamentos`);
  }

  // Método para gerar uma estimativa de orçamento
  gerarEstimativa(idDemanda: number): Observable<any> {
    return this.http.post(`${this.apiUrl}/demandas/${idDemanda}/gerar-estimativa`, {});
  }
}
