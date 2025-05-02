import java.util.ArrayList;
public class ContaTel{
  private int mes, ano,contrato;
  private ArrayList<Ligacao>ligacoes;
  
  public ContaTel(int mes, int ano, int contrato){
    this.mes=mes;
    this.ano=ano;
    this.contrato=contrato;
    this.ligacoes= new ArrayList<Ligacao>();
  }
  
  public void addLigacao(Ligacao lig){
    ligacoes.add(lig);
  }
  
  public float totalConta(){
    float total=0;
    for(Ligacao lig: ligacoes){
      total+=lig.valorLigacao();
    }
    return total;
  }

  public float totalConta(String localDestino){
    float total=0;
    for(Ligacao lig : ligacoes) {
      if (lig.getLocalDestino().equals(localDestino){
        total+=lig.getValorTotal();
      }
    }
    return total;
  }
  
}
