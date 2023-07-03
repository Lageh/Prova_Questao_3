package core;

import java.util.Date;

public class Livro {
    private String nome;
    private String autor;
    private Date publicacao;
    private int codigo;
    private Status status;

    public Livro(String nome, String autor, Date publicacao, int codigo, Status status) {
        this.nome = nome;
        this.autor = autor;
        this.publicacao = publicacao;
        this.codigo = codigo;
        this.status = status;
    }

    public Livro(String nome, String autor, Date publicacao, int codigo) {
        this.nome = nome;
        this.autor = autor;
        this.publicacao = publicacao;
        this.codigo = codigo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
