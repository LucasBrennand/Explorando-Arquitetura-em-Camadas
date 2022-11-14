package dados;

import negocio.ExcecaoElementoInexistente;
import negocio.ExcecaoElementoJaExiste;
import negocio.ExcecaoRepositorio;
import negocio.aluno.Aluno;

public interface IRepositorioAluno {

  public void inserirAluno(Aluno aluno) throws ExcecaoElementoJaExiste, ExcecaoRepositorio;
  public void alterarAluno(Aluno aluno) throws ExcecaoElementoInexistente, ExcecaoRepositorio;
  public void removerAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio;
  public Aluno buscarAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio;
  public boolean verificarExistenciaAluno(String matricula);

}
