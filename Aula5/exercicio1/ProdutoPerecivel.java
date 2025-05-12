public class ProdutoPerecivel extends Produto{
  
  protected String validade, formaArmazenamento;
  
  public ProdutoPerecivel(String codigo, String nome, float precoCusto, String substancia){
    super(codigo, nome, precoCusto);
    this.validade=validade;
    this.formaArmazenamento=formaArmazenamento;
  }
  public String getValidade() {
        return validade;
    }
  public void setValidade(String validade) {
      this.validade = validade;
  }
  public String getFormaArmazenamento() {
        return formaArmazenamento;
    }
  public void setFormaArmazenamento(String formaArmazenamento) {
      this.formaArmazenamento = formaArmazenamento;
  }
}
