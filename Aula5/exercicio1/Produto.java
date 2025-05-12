public class Produto{
  protect String codigo, nome;
  protect float precoCusto;
  public Produto(String codigo, String nome, float precoCusto){
    this.codigo=codigo;
    this.nome=nome;
    this.precoCusto=precoCusto;
  }

  public String getCodigo(){
    return this.codigo;
  }

  public void setCodigo(String codigo){
    this.codigo=codigo;
  }
  
  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  
  public String getPrecoCustoe(){
    return this.precoCusto;
  }

  public void setPrecoCusto(float precoCusto){
    this.precoCusto=precoCusto;
  }

  public float precoVenda(){
    
  }
}
