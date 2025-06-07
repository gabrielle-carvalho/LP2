/**
Criar uma classe para representar aluno de uma faculdade. A classe possui os atributos matrícula, nome, ano de ingresso, curso, qtd de disciplinas matriculadas, situação do aluno (matriculado ou não matriculado). Esta classe deve possuir os seguintes métodos:
- Método para criar um aluno com matricula, nome, ano de ingresso e curso.
- Método para calcular o tempo (em anos) de permanência do aluno na faculdade. Para isso receber como argumento o ano atual e calcular há quantos anos o aluno já está na faculdade considerando seu ano de ingresso.
- Método para calcular a mensalidade do aluno considerando R$ 150,00 por disciplina matriculada. 
 */

//QUESTÃO 1
public class Aluno
{
    //declarando variáveis (atributos)
    int matricula, quantdDisciplinas,anoIngresso;
    String nomeAluno, curso, situacao;
    
    //criando um novo objeto (metodo criaraluno)
    void alunoNovo(int nmatricula, String nome, int ingresso, String ncurso){
        matricula = nmatricula;
        nomeAluno = nome;
        anoIngresso = ingresso;
        curso = ncurso;
    }
    
    //'anoAtual' não precisou ser declarada antes
    int calculaTempo (int anoAtual){
        int tempoCurso;
        tempoCurso = anoAtual-anoIngresso;
        return tempoCurso;
    }
    
    float calcularMensalidade(int qtd){
        quantdDisciplinas = qtd;
        return quantdDisciplinas*150;
    }
    
}
