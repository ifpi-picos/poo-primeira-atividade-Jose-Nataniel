package br.edu.ifpi.dominio;
public class Certificado{
    public static final char[] format = null;
    Aluno aluno;
    Curso curso;
    public Certificado(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public Curso getCurso() {
        return curso;
    }
    @Override
    public String toString() {
        return "Certificado [aluno=" + aluno + ", curso=" + curso + "]";
    }
    
}