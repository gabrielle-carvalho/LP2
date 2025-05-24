public class Carga extends Automovel{
    protected float pesoMaximo;
    public Carga(String placa, String anoFabricacao, float pesoMaximo){
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