package com.example.ProjAvaliacaoInfnet.repository;

import com.example.ProjAvaliacaoInfnet.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findAllByProdutoId(Long produtoId);
}
