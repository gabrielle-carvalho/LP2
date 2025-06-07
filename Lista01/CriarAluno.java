// QUESTAO 1 LADO B
public class CriarAluno
{
        //declarando variáveis (atributos)
        private int matricula, quantdDisciplinas,anoIngresso;
        private String nomeAluno, curso, situacao;
        
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
            // tempoCurso = anoAtual-this.anoIngresso;
            return this.anoAtual-this.anoIngresso;
        }
        void informarDisciplina(int qtd){
            this.quantdDisciplinas = qtd;
            System.out.println("sua mensalidade será:" + this.calcularMensalidade());
        }
        
        float calcularMensalidade(){
            return this.quantdDisciplinas*150;
        }
        
    }

