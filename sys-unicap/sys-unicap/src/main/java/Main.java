import dados.RepositorioAluno;
import negocio.*;
import negocio.aluno.Aluno;
import negocio.aluno.Endereco;

public class Main {
  private static IFachada fachada = new Fachada();

  public static void main(String[] args) {
    try {
      Endereco endereco = new Endereco("Masc.Maroes", 111);
      Aluno aluno = new Aluno("001", "luisa", endereco);
      fachada.inserirAluno(aluno);
      fachada.removerAluno("001");
      System.out.println(aluno.getMatricula() + " " + aluno.getNome() + " " + endereco.getRua() + " " + endereco.getNumero());
    } catch (ExcecaoElementoJaExiste e) {
      System.out.println(e.getMessage());
    } catch (ExcecaoRepositorio e) {
      System.out.println(e.getMessage());
    } catch (ExcecaoElementoInexistente e) {
      throw new RuntimeException(e);
    }
  }
}
