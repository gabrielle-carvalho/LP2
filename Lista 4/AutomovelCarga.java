public class AutomovelCarga extends Automovel{
    protected float pesoMaximo;
    public AutomovelCarga(String placa, String anoFabricacao, float pesoMaximo){
        super(placa, anoFabricacao);
        this(pesoMaximo);
    }

    public float getPesoMaximo() {
        return pesoMaximo;
  }
  
  public void setPesoMaximo(float pesoMaximo) {
      this.pesoMaximo = pesoMaximo;
  }
}
