package aplicacao;

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
            System.out.println("Livro " + livro.getNome() + " emprestado para " + usuario.getNome());
        } else{
            System.out.println("Impossível emprestar livro. Livro: " + livro.getNome() + " não está disponível");
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        usuario.removerLivro(livro);
        livro.setStatus(Status.DISPONIVEL);
        System.out.println("O livro " + livro.getNome() + " foi devolvido por " + usuario.getNome());
    }
}
