public class AutomovelPasseio extends Automovel{
    protected int qtdPessoas;
    public AutomovelPasseio(String placa, String anoFabricacao, int qtdPessoas){
        super(placa, anoFabricacao);
        this(qtdPessoas);
    }

    public float getQtdPessoas() {
        return qtdPessoas;
  }
  
  public void setQtdPessoas(float qtdPessoas) {
      this.qtdPessoas = qtdPessoas;
  }
}
