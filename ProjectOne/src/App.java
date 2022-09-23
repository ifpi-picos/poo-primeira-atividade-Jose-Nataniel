import java.util.Date;
import br.edu.ifpi.dominio.*;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Aluno aluno = new Aluno("José Nataniel N. Andrade da Silva",
                sdf.parse("29/05/2002"), "capic.2020118tads0339@aluno.ifpi.edu.br");

        Professor professor = new Professor("Jesiel",
                "professorjesiel@ifpi.edu.br", "Mestre");

        Curso curso = new Curso("Análise e Desenvolvimento de sistemas",
                2040, "Presencial", "Superior",
                sdf.parse("11/03/2020"), sdf.parse("20/01/2025"),
                true, professor);

        Certificado certificado = new Certificado(aluno, curso);

        // System.out.println(certificado);
        System.out.format(
                "O aluno %s, tem %s como professor, fez o curso de %s, \ncom carga horária de: %d Hrs, e teve inicio em  %s e foi concluido em %s.",
                aluno.getNome(), professor.getNome(), curso.getNome(), curso.getCargaHoraria(),
                sdf.format(curso.getDataDeInicio()), sdf.format(curso.getDataDeFim()));
    }
}