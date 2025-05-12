public class Sala3D extends Sala{
  protected String equipamento;
  
  public Sala3D(int numeroSala, int capacidade, String equipamento){
    super(numeroSala, capacidade);
    this.equipamento=equipamento;
  }

  public String getEquipamento() {
        return equipamento;
  }

  public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
  }
  
}
