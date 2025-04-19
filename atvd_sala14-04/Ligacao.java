// Crie uma classe ligação telefônica. Uma ligação telefônica possui como atributos o número do 
// telefone que a originou, o nome da localidade de origem, o número e o local de destino da 
// ligação, o valor total da ligação, o momento de início e o momento de término da ligação. Para 
// representar um momento, crie uma classe de nome Tempo. Esta classe representará uma hora, 
// minuto e segundo. A classe que representa a ligação telefônica forneça os seguintes métodos: 
// • Método que permita criar uma ligação fornecendo o momento do inicio, o local e o 
// número de origem e o local e o número de destino da ligação. 
// • Método que calcule o valor da ligação. O valor da ligação será correspondente a R$ 1.00 
// por minuto. Mesmo que o usuário fale por 30s será cobrado um minuto. Divida as 
// responsabilidades e construa os métodos nas classes mais apropriadas. 
// • Método que receba como parâmetro um número de telefone e informe se a ligação foi 
// originada ou se destinava ao número informado. Exemplo: para uma ligação originada do 
// número 99999999 e que se destinava ao número 2222222. O método deve retornar 
// positivamente a mensagem que pergunta se 99999999 é um telefone envolvido e a 
// mensagem que pergunta se 2222222 é um telefone envolvido e negativamente para 
// qualquer outra.
// Continuando o exercício anterior, crie uma classe conta telefônica. Uma conta telefônica possui 
// como atributos, o mês e o ano de referência, o número do contrato que lhe deu origem e uma 
// lista de ligações telefônicas. Para esta classe crie os métodos abaixo (necessário conhecimento 
// sobre arrays): 
// • Método que permita criar uma conta telefônica sem nenhuma ligação (uma nova conta).
// • Método que permita adicionar uma ligação a uma conta telefônica.
// • Método que calcule e retorne o valor total da conta telefônica. O valor total da conta 
// corresponde a soma dos valores de todas as ligações associadas à conta. 
// • Sobrecarregue o membro anterior para receber uma String contendo o local de destino da 
// ligação como parâmetro e retorne o valor acumulado das ligações para aquele destino. 

public class Ligacao
{
    private int numeroOrigem, numeroDestino;
    private String localidade;
    private float valorTotal;
    private Tempo inicio;
    private Tempo total;

    public Ligacao(Tempo inicio, String localidade, int numeroOrigem, int numeroDestino){
        this.inicio=inicio;
        this.localidade=localidade;
        this.numeroOrigem=numeroOrigem;
        this.numeroDestino=numeroDestino;
    }
    
    private int valorLigacao(Tempo total){
        int val=total*1;
        return  val;
    }
    
    
}
