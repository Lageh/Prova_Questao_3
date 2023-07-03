package core;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaLivros;

    public Biblioteca() {
        this.listaLivros = new ArrayList<Livro>();
    }

    public void adicionarLivros(Livro livro){
        listaLivros.add(livro);
    }

    public void excluirLivros(Livro livro){
        this.listaLivros.remove(livro);
    }

    public ArrayList<Livro> listarLivros(){
        return this.listaLivros;
    }
}
