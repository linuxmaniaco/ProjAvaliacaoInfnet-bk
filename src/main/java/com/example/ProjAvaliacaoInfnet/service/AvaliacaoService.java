package com.example.ProjAvaliacaoInfnet.service;

import com.example.ProjAvaliacaoInfnet.model.Avaliacao;
import com.example.ProjAvaliacaoInfnet.repository.AvaliacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {
    private final AvaliacaoRepository avaliacaoRepository;
    public List<Avaliacao> getAllByProdutoId(Long produtoId){
        return avaliacaoRepository.findAllByProdutoId(produtoId);
    }
}
