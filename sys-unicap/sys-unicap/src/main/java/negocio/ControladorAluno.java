package negocio;

import dados.IRepositorioAluno;
import dados.RepositorioAluno;
import negocio.aluno.Aluno;

public class ControladorAluno {
  private IRepositorioAluno repositorioAluno;

  public ControladorAluno() {
    this.repositorioAluno = new RepositorioAluno();
  }

  public void inserirAluno(Aluno aluno) throws ExcecaoElementoJaExiste, ExcecaoRepositorio {
    this.repositorioAluno.inserirAluno(aluno);
  }

  public void alterarAluno(Aluno aluno) throws ExcecaoElementoInexistente, ExcecaoRepositorio {
    this.repositorioAluno.alterarAluno(aluno);
  }

  public void removerAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio {
    this.repositorioAluno.removerAluno(matricula);

  }

  public Aluno buscarAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio {
    return this.repositorioAluno.buscarAluno(matricula);
  }
}
