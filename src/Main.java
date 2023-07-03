import application.GestaoDeLivros;
import core.Biblioteca;
import core.Livro;
import core.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Guilherme","01");
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Com casmurro",1);
        GestaoDeLivros app = new GestaoDeLivros(biblioteca);

    }
}
