// 2. Um curso de uma faculdade é representado por um código, nome, duração (em semestres), 
//valor total do curso e ano de criação do curso. Construa uma classe curso com os seguintes métodos:
// · Criação de um curso com todos os dados necessários;
// · Criação de um curso sem informar a duração. Neste caso o default são 8 semestres;
// · Metódo para calcular o valor da mensalidade de um aluno, considerando que o valor é fíxo, ou seja,
// o valor total do curso pode ser pago em parcelas mensais.

public class Curso{
  int codigo, duracao, anoCriacao;
  String nome;
  float valorTotal;
  
  public Curso(int codigo, int duracao, int anoCriacao, String nome, float valorTotal){
    this.codigo=codigo;
    this.duracao=duracao;
    this.anoCriacao=anoCriacao;
    this.nome=nome;
    this.valorTotal=valorTotal;
  }

  public Curso(int codigo, int anoCriacao, String nome, float valorTotal){
    this(codigo, 8, anoCriacao, nome, valorTotal);
  }

  public float calcMens(){
    int totalMeses=duracao*6;
    return valorTotal/totalMeses;
  }

  public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
