package core;

import java.util.Date;

public class Livro {
    private String nome;
    private int codigo;
    private Status status;

    public Livro(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.status = Status.DISPONIVEL;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
