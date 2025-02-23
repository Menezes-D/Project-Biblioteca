package br.com.fecaf.controller;


import br.com.fecaf.model.Livro;
import br.com.fecaf.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/livros")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listaLivros();
    }

    @PostMapping("/adicionarLivro")
    public ResponseEntity<Livro> adicionarLivro(@RequestBody Livro livro) {
        Livro newLivro = livroService.salvarLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLivro);
    }


    @PutMapping("{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro livro) {
        livro.setId(id);
        return  livroService.salvarLivro(livro);
    }

    @DeleteMapping("/deletarLivro/{id}")
    public ResponseEntity<Void> deletarLivro (@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }



}

