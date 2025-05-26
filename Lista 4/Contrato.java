public class Contrato{
  protected String cpf, nome, endereco, email, telefone;
  private ArrayList<Automovel> meusAutos;
  
  public Contrato(String cpf, String nome, String endereco, String email, String telefone, Automovel meusAutos){
    this(cpf, nome, endereco, email, telefone);
    this.meusAutos = new ArrayList<Automovel>();
  }
  public void addAuto(Automovel auto){
    this.meusAutos.add(auto);
  }
}
