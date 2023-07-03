package application;

import core.Biblioteca;
import core.Livro;
import core.Status;
import core.Usuario;

public class GestaoDeLivros {

    private Biblioteca biblioteca;

    public GestaoDeLivros(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void emprestarLivro(Livro livro, Usuario usuario){
        if(livro.getStatus() == Status.DISPONIVEL){
            usuario.adicionarLivro(livro);
            livro.setStatus(Status.EMPRESTADO);
        } else{
            System.out.println("Impossível emprestar livro. Livro: " + livro.getNome() + "não está disponível");
        }
    }
}
