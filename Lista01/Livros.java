// Considere um sistema para uma livraria e construa uma classe que represente os livros vendidos na loja. 
// Todo livro possui como atributos nome, autor, preço de custo, edição e ano. Esta classe deve possuir os seguintes métodos:
// - método para criar um livro com todos os seus dados.
// - Construa um método para calcular o preço de venda do livro. Para isso deve ser informado o percentual de lucro da loja a ser aplicado sobre o preço de custo do livro.
// - Construa um método para imprimir os dados de um livro 
// QUESTAO 2
public class Livros{
  private String nome, autor;
  private float preco, porcento;
  private int edicao, ano;

  void criarLivro(String nome, String autor, float preco, int edicao, int ano){
    this.nome = nome;
    this.autor = autor;
    this.preco = preco;
    this.edicao = edicao;
    this.ano = ano;
  }

  void informarPercentual(int porcento){
    this.porcento = porcento;
    System.out.println("Preço de venda do livro: " + this.precovenda());
  }

  float precoVenda(){
    return this.preco + (this.preco/100 * porcento);
  }

  String printDadosLivros(){
    return "Nome: "+this.nome+ " Autor: "+this.autor+" Preco: "+ this.preco+" Edicao: "+this.edicao+" Ano de publicação: "+this.ano;
  }
  
}
