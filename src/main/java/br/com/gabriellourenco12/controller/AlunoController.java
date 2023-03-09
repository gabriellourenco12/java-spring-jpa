package br.com.gabriellourenco12.controller;

import br.com.gabriellourenco12.entity.Aluno;
import br.com.gabriellourenco12.entity.form.AlunoForm;
import br.com.gabriellourenco12.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }
}
