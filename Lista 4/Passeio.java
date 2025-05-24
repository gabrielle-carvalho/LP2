public class Passeio extends Automovel{
    protected int passageiros;
    public Passeio(String placa, String anoFabricacao, int passageiros){
        super(placa, anoFabricacao);
        this(passageiros);
    }

    public float getPassageiros() {
        return passageiros;
  }
  
  public void setPassageiros(float passageiros) {
      this.passageiros = passageiros;
  }
}