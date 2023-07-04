package core;

import interfaces.Auditoria;

import java.sql.Timestamp;
import java.util.Date;

public class Livro implements Auditoria {
    private String nome;
    private int codigo;
    private Status status;
    private String criadoPor;
    private Timestamp criadoEm;
    private String alteradoPor;
    private Timestamp alteradoEm;

    public Livro(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.status = Status.DISPONIVEL;
        this.criadoPor = "Admin";
        this.criadoEm = new Timestamp(System.currentTimeMillis());
        this.alteradoPor = "Admin";
        this.alteradoEm = new Timestamp(System.currentTimeMillis());

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
        alterar();
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        alterar();
        this.codigo = codigo;
    }

    @Override
    public void auditar() {
        System.out.println("Livro " + nome  + " criado por " + criadoPor + " em " + criadoEm +
                "\nAlterado por " + alteradoPor + " em " + alteradoEm + "\n");
    }

    @Override
    public void alterar() {
        this.alteradoPor = "Admin";
        this.alteradoEm = new Timestamp(System.currentTimeMillis());
    }
}
