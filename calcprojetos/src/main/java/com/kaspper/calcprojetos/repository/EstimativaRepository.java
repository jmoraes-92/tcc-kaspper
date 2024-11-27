package com.kaspper.calcprojetos.repository;

import com.kaspper.calcprojetos.model.Estimativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimativaRepository extends JpaRepository<Estimativa, Integer> {
}
