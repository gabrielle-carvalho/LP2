
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
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
