// Criar uma classe para representar aluno de uma faculdade. 
// A classe possui os atributos matrícula, nome, ano de ingresso, curso, qtd de disciplinas matriculadas, situação do aluno (matriculado ou não matriculado).
//Esta classe deve possuir os seguintes métodos:
// - Método para criar um aluno com matricula, nome, ano de ingresso e curso.
// - Método para calcular o tempo (em anos) de permanência do aluno na faculdade. 
//Para isso receber como argumento o ano atual e calcular há quantos anos o aluno já está na faculdade considerando seu ano de ingresso.
// - Método para calcular a mensalidade do aluno considerando R$ 150,00 por disciplina matriculada.

public class Aluno{
  private String nome, curso, situacao;
  private int matricula, anoIngresso, qtdDisciplinas;
  
  public Aluno(int matricula, String nome, int anoIngresso, String curso){
    this.matricula=matricula;
    this.nome=nome;
    this.anoIngresso=anoIngresso;
    this.curso=curso;
  }

  int tempoPermanencia(int anoAtual){
    return anoAtual-this.anoIngresso;
  }
  float mensalidade(int qtd){
    return 150*qtd;
  }
  
}
