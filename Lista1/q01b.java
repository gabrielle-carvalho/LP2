
/**
 * Escreva uma descrição da classe CriarAluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CriarAluno
{

        //declarando variáveis (atributos)
        int matricula, quantdDisciplinas,anoIngresso;
        String nomeAluno, curso, situacao;
        
        //criando um novo objeto (metodo criaraluno)
        public CriarAluno(int matricula, String nomeAluno, int anoIngresso, String curso){
            this.matricula = matricula;
            this.nomeAluno = nomeAluno;
            this.anoIngresso = anoIngresso;
            this.curso = curso;
        }
        
        //'anoAtual' não precisou ser declarada antes
        int calculaTempo (int anoAtual){
            int tempoCurso;
            tempoCurso = anoAtual-this.anoIngresso;
            return tempoCurso;
        }
        void informarDisciplina(int qtd){
            this.quantdDisciplinas = qtd;
            System.out.println("sua mensalidade será:" + this.calcularMensalidade());
        }
        
        float calcularMensalidade(){
            return this.quantdDisciplinas*150;
        }
        
    }

