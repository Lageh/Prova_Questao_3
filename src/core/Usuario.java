package core;

import interfaces.Auditoria;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Usuario implements Auditoria {
    private String nome;
    private String codigo;
    private ArrayList<Livro> emPosse;
    private String criadoPor;
    private Timestamp criadoEm;
    private String alteradoPor;
    private Timestamp alteradoEm;

    public Usuario(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.emPosse = new ArrayList<Livro>();
        this.criadoPor = "Admin";
        this.criadoEm = new Timestamp(System.currentTimeMillis());
        this.alteradoPor = criadoPor;
        this.alteradoEm = criadoEm;

    }

    public ArrayList<Livro> listarLivros() {
        return this.emPosse;
    }

    public void adicionarLivro(Livro livro) {
        alterar();
        this.emPosse.add(livro);
    }

    public void removerLivro(Livro livro) {
        alterar();
        this.emPosse.remove(livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        alterar();
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        alterar();
        this.codigo = codigo;
    }

    @Override
    public void auditar() {
        System.out.println("Usuario " + nome + " criado por " + criadoPor + " em " + criadoEm +
                "\nAlterado por " + alteradoPor + " em " + alteradoEm + "\n");
    }

    @Override
    public void alterar() {
        this.alteradoPor = "Admin";
        this.alteradoEm = new Timestamp(System.currentTimeMillis());
    }
}
