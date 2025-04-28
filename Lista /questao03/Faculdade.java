// · Adicionar um Curso (passado como parâmetro) à faculdade. Entretanto, não é possível adicionar um curso já existindo um outro curso com o mesmo nome na Faculdade.

// · Remover um Curso dado um nome, passado como parâmetro. Se não houver nenhum curso com o nome fornecido, uma mensagem deve ser impressa na tela informando o fato;

// · Retornar uma nova Faculdade (uma nova instância da classe Faculdade) que contenha como cursos, os cursos que foram criados no máximo 5 anos depois da Faculdade. Este método deve receber como parâmetro o nome e o ano de criação da nova faculdade.

import java.util.ArrayList;
public class Faculdade{
  private String nome;
  private int anoCriacao
  private ArrayList<Curso> course = new ArrayList<Curso>();

  public Faculdade(String nome, int anoCriacao){
    this.nome=nome;
    this.anoCriacao=anoCriacao;
  }

  public void addCurso(Curso curs){
    this.course.add(curs);
  }
  
  public String getNome(){
    return this.nome;
  }
  public int getAnoCriacao(){
    return this.anoCriacao;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  public void setAnoCriacao(int anoCriacao){
    this.anoCriacao=anoCriacao;
  }

  public void setShop(String ArrayList<Curso>course){
    this.course=course;
  }
  
}
