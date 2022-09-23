package br.edu.ifpi.dominio;

public class Professor {
    private String nome;
    private String email;
    private String formacao;

    public Professor(String nome, String email, String formacao) {
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor [formacao=" + formacao + ", nome=" + nome + "]";
    }

}
