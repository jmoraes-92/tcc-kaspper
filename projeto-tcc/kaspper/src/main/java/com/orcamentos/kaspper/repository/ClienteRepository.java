package com.orcamentos.kaspper.repository;

import com.orcamentos.kaspper.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByEmail(String email);
}
