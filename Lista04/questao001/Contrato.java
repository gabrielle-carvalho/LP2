import java.util.*;

public class Contrato{
  protected String cpf, nome, endereco, email, telefone;
  private ArrayList<Automovel> meusAutos;
  
  public Contrato(String cpf, String nome, String endereco, String email, String telefone, Automovel meusAutos){
    this.cpf=cpf;
    this.nome=nome;
    this.endereco=endereco;
    this.email=email;
    this.telefone=telefone;
    this.meusAutos = new ArrayList<Automovel>();
  }
  public void addAuto(Automovel auto){
    this.meusAutos.add(auto);
  }
  public float fatura(){
    float total=0;
    for(Automovel auto : meusAutos){
      total += auto.passagem()*auto.qtdPassagem();
    }
    return total;
    }
}
