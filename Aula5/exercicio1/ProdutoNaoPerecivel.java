public class ProdutoNaoPerecivel extends Produto{
  
  protected String substancia;
  public ProdutoNaoPerecivel(String codigo, String nome, float precoCusto, String substancia){
    super(codigo, nome, precoCusto);
    this(substancia);
  }
  
  public String getSubstancia() {
        return substancia;
  }
  
  public void setSubstancia(String substancia) {
      this.substancia = substancia;
  }
}
