package br.com.alura.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Resposta;
import br.com.alura.forum.repository.RespostaRepository;

@RestController
@RequestMapping("/respostas")
public class RespostaController {
    
    @Autowired
    private RespostaRepository respostaRepository;

    @GetMapping
    public Page<Resposta> lista(
        @RequestParam(required = true) Long idTopico,
        @PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao
    ) {
        return respostaRepository.findByTopico_Id(idTopico, paginacao);
    }
}
