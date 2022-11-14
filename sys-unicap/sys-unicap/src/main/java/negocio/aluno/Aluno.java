package negocio.aluno;

public class Aluno {
  private String matricula;
  private String nome;
  private Endereco endereco;

  public Aluno(String matricula, String nome, Endereco endereco){
    this.matricula = matricula;
    this.nome = nome;
    this.endereco = endereco;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
