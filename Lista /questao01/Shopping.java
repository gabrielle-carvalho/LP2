
import java.util.ArrayList;
public class Shopping{
  private String nome;
  private ArrayList<Loja> shop;

  public Shopping(String nome){
    this.nome=nome;
    shop=new ArrayList<Loja>();
  }
  public void addLoja(Loja loj){
    this.shop.add(loj);
  }  

  public String getNome(){
    return this.nome;
  }
  public ArrayList<Loja> getShop(){
    return this.shop;
  }

  public void setNome(String nome){
    this.nome=nome;
  }

  public void setShop(ArrayList<Loja> shop){
    this.shop=shop;
  }

  public String maiorFat(){
    float maior=0;
    String nomeFantasia = "";
    for(Loja loj:shop){
      if(maior<loj.getFaturamento()){
        maior=loj.getFaturamento();
        nomeFantasia = loj.getNomeFantasia();
    }
  }
    return nomeFantasia;
  }

  public float fatMedio(){
    float soma=0;
    int i=0;
    for(Loja loj:shop){
      // if (loj.getFaturamento()>1000)
      if (loj.verificarFat(1000)){
        soma+=loj.getFaturamento();
        i++;
      }
    }
    return soma/i;
  }
  
}
