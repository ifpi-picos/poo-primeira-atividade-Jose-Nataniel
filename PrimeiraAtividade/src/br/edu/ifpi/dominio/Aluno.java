package br.edu.ifpi.dominio;

import java.util.Date;

public class Aluno {
    private String nome;
    private Date dataDeNascismento;
    private String email;

    public Aluno(String nome, Date dataDeNascismento, String email) {
        this.nome = nome;
        this.dataDeNascismento = dataDeNascismento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascismento() {
        return dataDeNascismento;
    }

    public void setDataDeNascismento(Date dataDeNascismento) {
        this.dataDeNascismento = dataDeNascismento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ("Nome do aluno: " + nome + ",Data De Nascismento: " + dataDeNascismento + "]");
    }

    
}
