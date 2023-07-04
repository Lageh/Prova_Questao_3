package core;

import interfaces.Auditoria;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Biblioteca implements Auditoria {
    private String nome;
    private ArrayList<Livro> listaLivros;
    private String criadoPor;
    private Timestamp criadoEm;
    private String alteradoPor;
    private Timestamp alteradoEm;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.listaLivros = new ArrayList<Livro>();
        this.criadoPor = "Admin";
        this.criadoEm = new Timestamp(System.currentTimeMillis());
        this.alteradoPor = "Admin";
        this.alteradoEm = new Timestamp(System.currentTimeMillis());
    }

    public void adicionarLivros(Livro livro){
        listaLivros.add(livro);
        alterar();
    }

    public void excluirLivros(Livro livro){
        this.listaLivros.remove(livro);
        alterar();
    }

    public ArrayList<Livro> listarLivros(){
        return this.listaLivros;
    }

    @Override
    public void auditar() {
        System.out.println("Biblioteca " + nome  + " criado por " + criadoPor + " em " + criadoEm +
                "\nAlterado por " + alteradoPor + " em " + alteradoEm + "\n");
    }

    @Override
    public void alterar() {
        this.alteradoPor = "Admin";
        this.alteradoEm = new Timestamp(System.currentTimeMillis());
    }
}
