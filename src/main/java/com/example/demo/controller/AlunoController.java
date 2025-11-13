package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        if (aluno.getCurso() != null && aluno.getCurso().getId() != null) {
            aluno.setCurso(cursoRepository.findById(aluno.getCurso().getId())
                    .orElseThrow(() -> new RuntimeException("Curso não encontrado")));
        }
        return alunoRepository.save(aluno);
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno dadosAtualizados) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        aluno.setNome(dadosAtualizados.getNome());
        aluno.setEmail(dadosAtualizados.getEmail());
        aluno.setDataNascimento(dadosAtualizados.getDataNascimento());
        aluno.setCurso(dadosAtualizados.getCurso());
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}
