package negocio;

import dados.RepositorioAluno;
import negocio.aluno.Aluno;

public class Fachada implements IFachada{
  private ControladorAluno controladorAluno;

  public Fachada(){
    this.controladorAluno = new ControladorAluno();
  }
  @Override
  public void inserirAluno(Aluno aluno) throws ExcecaoElementoJaExiste, ExcecaoRepositorio{
    this.controladorAluno.inserirAluno(aluno);
  }

  @Override
  public void alterarAluno(Aluno aluno) throws ExcecaoElementoInexistente, ExcecaoRepositorio{
    this.controladorAluno.alterarAluno(aluno);

  }

  @Override
  public void removerAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio{
    this.controladorAluno.removerAluno(matricula);
  }

  @Override
  public Aluno buscarAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio{
    return this.controladorAluno.buscarAluno(matricula);
  }
}
