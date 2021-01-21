package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

public class TopicoDetalheDto {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;

    public TopicoDetalheDto(Topico topico) {
        this.id = topico.getId();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.respostas =
        topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList());
    }

    public List<RespostaDto> getRespostas() {
        return respostas;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public Long getId() {
        return id;
    }
}
