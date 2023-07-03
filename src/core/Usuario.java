package core;

import java.util.ArrayList;

public class Usuario {
    private String usuario;
    private String codigo;
    private ArrayList<Livro> emPosse;

    public ArrayList<Livro> listarLivros(){
        return this.emPosse;
    }

    public void adicionarLivro(Livro livro){
        this.emPosse.add(livro);
    }

    public void removerLivro(Livro livro){
        this.emPosse.remove(livro);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
