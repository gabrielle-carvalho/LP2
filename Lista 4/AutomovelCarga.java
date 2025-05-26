public class AutomovelCarga extends Automovel{
    protected float peso;
    public AutomovelCarga(String placa, String anoFabricacao, float peso){
        super(placa, anoFabricacao);
        this(peso);
    }

    public float getPeso() {
        return peso;
  }
  
  public void setPeso(float peso) {
      this.peso = peso;
  }
}
