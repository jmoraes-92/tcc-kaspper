package com.kaspper.calcprojetos.repository;

import com.kaspper.calcprojetos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Métodos de consulta personalizada podem ser adicionados aqui
}
