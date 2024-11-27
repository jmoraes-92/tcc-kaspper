package com.orcamentos.kaspper.repository;

import com.orcamentos.kaspper.model.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
    // Métodos adicionais, se necessários, podem ser adicionados aqui
}
