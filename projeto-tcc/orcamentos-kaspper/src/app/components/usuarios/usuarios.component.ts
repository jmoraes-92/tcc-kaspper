import { Component, OnInit } from '@angular/core';
import { UsuarioService } from '../../services/usuario.service';
import { Usuario } from '../../models/usuario.model';

@Component({
    selector: 'app-usuarios',
    templateUrl: './usuarios.component.html',
    styleUrls: ['./usuarios.component.scss']
})
export class UsuariosComponent implements OnInit {
    usuarios: Usuario[] = [];

    constructor(private usuarioService: UsuarioService) {}

    ngOnInit(): void {
        this.usuarioService.listarUsuarios().subscribe((data) => {
            this.usuarios = data;
        });
    }
}
