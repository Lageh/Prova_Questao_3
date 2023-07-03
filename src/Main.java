import application.GestaoDeLivros;
import core.Biblioteca;
import core.Livro;
import core.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Guilherme","01");
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Com casmurro",1);
        Livro livro2 = new Livro("Mochileiro das galáxias",2);
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        GestaoDeLivros app = new GestaoDeLivros(biblioteca);
        app.emprestarLivro(livro1,usuario);
        app.emprestarLivro(livro2,usuario);
        System.out.println(livro1.getStatus());

        ArrayList<Livro> li = usuario.listarLivros();

        for (Livro l : li) {
            System.out.println(l.getNome());
        }

    }
}
