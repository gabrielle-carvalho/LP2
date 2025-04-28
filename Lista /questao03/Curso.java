public class Curso{
  private String codigo, nome;
  private int duracao, anoCriacao;
  private float valorTotal;
  
  public Curso(String codigo, String nome, int duracao, int anoCriacao, float valorTotal){
    this.codigo=codigo;
    this.nome=nome;
    this.duracao=duracao;
    this.anoCriacao=anoCriacao;
    this.valorTotal=valorTotal;
  }

  public Curso(String codigo, String nome, int anoCriacao, float valorTotal){
    this.codigo=codigo;
    this.nome=nome;
    this.duracao=8;
    this.anoCriacao=anoCriacao;
    this.valorTotal=valorTotal;
  }
  
  public String getCodigo(){
    return this.codigo;
  }

  public String getNome(){
    return this.nome;
  }

  public int getDuracao(){
    return this.duracao;
  }

  public int getAnoCriacao(){
    return this.anoCriacao;
  }

  public float getValorTotal(){
    return this.valorTotal;
  }
  
  public void setCodigo(String codigo){
    this.codigo=codigo;
  }
  public void setNome(String nome){
    this.nome=nome;
  }
  public void setDuracao(int duracao){
    this.duracao=duracao;
  }
  public void setAnoCriacao(int anoCriacao){
    this.anoCriacao=anoCriacao;
  }
  public void setValorTotal(float valorTotal){
    this.valorTotal=valorTotal;
  }
  

  public float calcMensalidade(){
    return valorTotal/duracao;
  }
 
}
