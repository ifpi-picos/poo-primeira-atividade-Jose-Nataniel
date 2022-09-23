package br.edu.ifpi.dominio;

import java.util.Date;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String modalidade;
    private String nivel;
    private Date dataDeInicio;
    private Date dataDeFim;
    private boolean gratuito;
    private Professor professor;

    public Curso(String nome, int cargaHoraria, String modalidade, String nivel, Date dataDeInicio, Date dataDeFim,
            boolean gratuito, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFim = dataDeFim;
        this.gratuito = gratuito;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(Date dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", dataDeFim=" + dataDeFim + ", dataDeInicio=" + dataDeInicio
                + ", modalidade=" + modalidade + ", nivel=" + nivel + ", nome=" + nome + ", professor=" + professor
                + "]";
    }

    

}
