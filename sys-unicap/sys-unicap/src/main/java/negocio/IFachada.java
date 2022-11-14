package negocio;

import negocio.aluno.Aluno;

public interface IFachada {

  public void inserirAluno(Aluno aluno) throws ExcecaoElementoJaExiste, ExcecaoRepositorio;

  public void alterarAluno(Aluno aluno) throws ExcecaoElementoInexistente, ExcecaoRepositorio;

  public void removerAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio;

  public Aluno buscarAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio;
}
