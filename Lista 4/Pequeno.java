public class Pequeno extends Automovel{
    protected String modelo;
    public Pequeno(String placa, String anoFabricacao, String modelo){
        super(placa, anoFabricacao);
        this(modelo);
    }

    public String getModelo() {
        return modelo;
  }
  
  public void setModelo(String modelo) {
      this.modelo = modelo;
  }
}