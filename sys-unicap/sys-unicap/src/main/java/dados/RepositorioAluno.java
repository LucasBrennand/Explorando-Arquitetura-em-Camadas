package dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import negocio.ExcecaoElementoInexistente;
import negocio.ExcecaoElementoJaExiste;
import negocio.ExcecaoRepositorio;
import negocio.aluno.Aluno;

public class RepositorioAluno implements IRepositorioAluno {
  private List<Aluno> alunos;

  public RepositorioAluno() {
    this.alunos = new ArrayList<>();
  }

  @Override
  public void inserirAluno(Aluno aluno) throws ExcecaoElementoJaExiste, ExcecaoRepositorio {
    if (!verificarExistenciaAluno(aluno.getMatricula())) {
      this.alunos.add(aluno);
    } else {
      throw new ExcecaoElementoJaExiste("Aluno já cadastrado");
    }
  }

  @Override
  public void alterarAluno(Aluno aluno) throws ExcecaoElementoInexistente, ExcecaoRepositorio {
    if (verificarExistenciaAluno(aluno.getMatricula())) {
      for (Aluno buscaAluno : alunos) {
        if (Objects.equals(buscaAluno.getMatricula(), aluno.getMatricula())) {
          alunos.get(alunos.indexOf(aluno)).setEndereco(aluno.getEndereco());
          alunos.get(alunos.indexOf(aluno)).setNome(aluno.getNome());
        }
        else {
          throw new ExcecaoElementoInexistente("Aluno não encontrado");
        }
      }
    }
  }
  @Override
  public void removerAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio{
    Aluno aluno = buscarAluno(matricula);
    if (verificarExistenciaAluno(matricula)) {
      this.alunos.remove(aluno);
    } else {
      throw new ExcecaoElementoInexistente("Aluno não encontrado");
    }
  }

  @Override
  public Aluno buscarAluno(String matricula) throws ExcecaoElementoInexistente, ExcecaoRepositorio {
    for (Aluno aluno : alunos) {
      if (Objects.equals(aluno.getMatricula(), matricula)) {
        return aluno;
      } else {
        throw new ExcecaoElementoInexistente("Aluno não encontrado");
      }
    }
    return null;
  }

  @Override
  public boolean verificarExistenciaAluno(String matricula) {
    return this.alunos.contains(matricula);
  }

}
