import aplicacao.GestaoDeLivros;
import core.Biblioteca;
import core.Livro;
import core.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Guilherme","01");
        Usuario usuario2 = new Usuario("askfiasf","20");
        usuario2.auditar();
        Biblioteca biblioteca = new Biblioteca("biblioteca 1");
        Livro livro1 = new Livro("Dom casmurro",1);
        Livro livro2 = new Livro("Mochileiro das galáxias",2);
        Livro livro3 = new Livro("Senhor dos Aneis",3);
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);

        ArrayList<Livro> listaDeLivros = biblioteca.listarLivros();

        for (Livro l:
                listaDeLivros) {
            System.out.println(l.getNome());
        }

        biblioteca.excluirLivros(livro1);
        listaDeLivros = biblioteca.listarLivros();

        for (Livro l:
                listaDeLivros) {
            System.out.println(l.getNome());
        }


        GestaoDeLivros app = new GestaoDeLivros(biblioteca);
        app.emprestarLivro(livro1,usuario);
        app.emprestarLivro(livro2,usuario);
        System.out.println(livro1.getStatus());
        ArrayList<Livro> li = usuario.listarLivros();

        for (Livro l : li) {
            System.out.println(l.getNome());
        }

        System.out.println(livro2.getStatus());
        app.emprestarLivro(livro2,usuario);
        app.devolverLivro(livro2,usuario);
        System.out.println(livro2.getStatus());

        usuario2.setCodigo("02");
        usuario2.auditar();

    }
}
