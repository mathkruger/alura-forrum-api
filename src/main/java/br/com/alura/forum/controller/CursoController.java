package br.com.alura.forum.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.repository.CursoRepository;

@RestController
@RequestMapping("/topicos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> lista() {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos = cursoRepository.findAll();
        return cursos;
    }
    
}
