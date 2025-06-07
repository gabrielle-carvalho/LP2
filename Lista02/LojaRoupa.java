// Uma loja de roupas possui um nome de fantasia, uma razão social, um número de cnpj, um dígito do cnpj, um valor de faturamento e uma área em m2. Construa uma classe loja conforme descrição acima e forneça os seguintes métodos:
// · Método que permita criar uma loja informando o nome de fantasia, a razão social, o cnpj e o digito do cnpj;
// · Método que permita criar uma loja informando o nome de fantasia, o cnpj e o digito do cnpj, o valor do faturamento e publico alvo. Neste caso considere que a razão social é igual ao nome de fantasia;
// · Método que permita verificar se uma loja tem faturamento superior ao de outra loja
// · Método que permita calcular o valor do aluguel de uma loja. Sabe-se que o aluguel custa R$50,00 por m2. 
public class LojaRoupa{
  private String nomeSocial, nomeFantasia,razaoSocial, publicoAlvo;
  private int numeroCnpj, digitocnpj;
  private float faturamento, area;

  public LojaRoupa(String nomeFantasia,  String razaoSocial, int numeroCnpj, int digitoCnpj){
    this.nomeFantasia=nomeFantasia;
    this.razaoSocial=razaoSocial;
    this.numeroCnpj=numeroCnpj;
    this.digitocnpj=digitoCnpj;
  }
  
  public LojaRoupa(String nomeFantasia, int numeroCnpj, int digitocnpj, int faturamento, String publicoAlvo){
    this(nomeFantasia,nomeFantasia,numeroCnpj, digitocnpj); //puxa do outro construtor os atributos qu vamos reutilizar nesse
    this.faturamento=faturamento;
    this.publicoAlvo=publicoAlvo;
  }

  public float calcularAluguel(){
    return this.area*50;
  }

  public boolean faturamentoMaior(LojaRoupa lojaDois){
    return this.faturamento>lojaDois.faturamento);
  }

  
  public void setNomeSocial(String nomeSocial){
    this.nomeSocial=nomeSocial;
  }
  
  public void setNomeFantasia(String nomeFantasia){
    this.nomeFantasia=nomeFantasia;
  }
  
  public void setRazaoSociala(String razaoSocial){
    this.razaoSocial=razaoSocial;
  }
  
  public void setPublicoAlvo(String publicoAlvo){
    this.publicoAlvo=publicoAlvo;
  }
  
  public void setNumeroCnpj(int numeroCnpj){
    this.numeroCnpj=numeroCnpj;
  }
  
  public void setDigitocnpj(int digitocnpj){
    this.digitocnpj=digitocnpj;
  }
  
  public void setFaturamento(float faturamento){
    this.faturamento=faturamento;
  }
  
  public void setArea(float area){
    this.area=area;
  }
  
}
