package br.com.fecaf.service;


import br.com.fecaf.model.Livro;
import br.com.fecaf.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    //Método para Listar os Livros
    public List<Livro> listaLivros() {
        return livroRepository.findAll();
    }

    //Método para Salvar novo Livro
    public Livro salvarLivro (Livro livro) {
        return livroRepository.save(livro);
    }

    //Método para Consultar Livro
    public Optional<Livro> consultarLivro(Long id) {
        return livroRepository.findById(id);
    }

    //Método para Deletar Livro
    public void deletarLivro (Long id) {
        livroRepository.deleteById(id);
    }

    //Método para Editar Livro
    public Livro atualizarLivro (Long id, Livro livroAtualizado) {
        Optional<Livro> livroExistente = livroRepository.findById(id);

        if (livroExistente.isPresent()) {
            Livro livro = livroExistente.get();
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setEditora(livroAtualizado.getEditora());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());

            return livroRepository.save(livro);
        }else {
            throw new RuntimeException("Livro não encontrado com o ID: " + id);
        }
    }
}
