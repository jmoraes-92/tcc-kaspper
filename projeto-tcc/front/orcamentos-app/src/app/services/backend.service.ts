import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root',
})
export class BackendService {
  private apiUrl = environment.apiUrl;

  constructor(private http: HttpClient) {}

  // Métodos para Demandas
  saveDemanda(demanda: any): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/demandas`, demanda);
  }

  getDemandas(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/demandas`);
  }

  getDemandaById(id: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/demandas/${id}`);
  }

  updateDemanda(id: number, demanda: any): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}/demandas/${id}`, demanda);
  }

  deleteDemanda(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/demandas/${id}`);
  }

  // Métodos para Clientes
  getClientes(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/clientes`);
  }

  saveCliente(cliente: any): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/clientes`, cliente);
  }

  // Métodos para Orçamentos
  gerarEstimativa(idDemanda: number): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/orcamentos/${idDemanda}/gerar-estimativa`, {});
  }

  getOrcamentos(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/orcamentos`);
  }

  listarOrcamentos(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/orcamentos`);
  }
  
}
