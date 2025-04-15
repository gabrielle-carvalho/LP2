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
