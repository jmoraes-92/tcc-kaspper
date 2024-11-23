export interface Usuario {
    idUsuario: number;
    nome: string;
    email: string;
    senha: string;
    perfil: 'admin' | 'gestor';
    dataCriacao: string;
}
