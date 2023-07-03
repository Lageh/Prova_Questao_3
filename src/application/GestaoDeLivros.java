package application;

import core.Biblioteca;
import core.Livro;

import java.util.ArrayList;

public class GestaoDeLivros {
    private Biblioteca biblioteca;

    public GestaoDeLivros() {
        this.biblioteca = new Biblioteca();
    }

    public GestaoDeLivros(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }


}
