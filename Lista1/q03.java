// Em um sistema para o Detran, a carteira de motorista é representada por um número, CPF do proprietário, tipo (A, B ou AB), data de validade, data de expedição, 
// pontos e situação (Valida, apreendida, vencida). Quando uma pessoa passa no exame do Detran, uma nova carteira é emitida com os dados do seu proprietário.
//Neste momento o proprietário não possui nenhum ponto na carteira. A medida que o tempo passa, se o proprietário fizer alguma infração, ele recebe pontos 
// que são acumulados em sua carteira. Caso ele ultrapasse 20 pontos sua carteira é apreendida. Esporadicamente, os pontos são zerados. 
// Implemente em Java uma classe que represente uma carteira. Forneça métodos para criar uma carteira, acrescentar pontos, consultar o saldo de pontos, 
// zerar a carteira, apreender a carteira, verificar se esta está válida.

public class CarteiraMotorista{
  String cpf, validade, expedicao, situacao;
  int numeros, pontos;

  public CarteiraMotorista(int numero, int pontos, String cpf, String tipo, String validade, String expedicao){
    this.numero=numero;
    this.cpf=cpf;
    this.tipo=tipo;
    this.validade=validade;
    this.expedicao=expedicao;
    this.pontos=0;
    this.situacao="valida";
  }
  void addPontos(int qtd){
    this.pontos+=qtd;
    //this.setPontos(this.getPontos()+qtd);
  }

  int saldo(){
    return this.pontos;
  }
  
  void zerar(){
    this.pontos=0;
  }

  void apreener(){
    if(this.pontos>20){
      this.situacao="Apreendida";
    }
  }
}

//this.situacao.equals("valida");
