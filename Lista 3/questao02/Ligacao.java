public class Ligacao
{
    private int 
    private String localOrigem, numeroOrigem, numeroDestino, localDestino;
    private float valorTotal;
    private Tempo inicio, fim, total;

    public Ligacao(Tempo inicio, Tempo fim, String localOrigem, String numeroOrigem, String numeroDestino, String localDestino){
        this.inicio=inicio;
        this.fim=fim;
        this.localDestino=localDestino;
        this.numeroOrigem=numeroOrigem;
        this.numeroDestino=numeroDestino;
        this.localOrigem=localOrigem;
        this.valorTotal = valorLigacao();
    }
    
    private float valorLigacao(Tempo total){
        int segundoInicio, segundoFim, segundo;
        segundoInicio= inicio.conversaoParaSegundo();
        segundoFim= fim.conversaoParaSegundo();
        segundo=segundoFim-segundoInicio;
        if(segundoInicio%60 >0){
            return segundo/60+1;
        }
        else{
            return segundo/60;
        }
    }
    
    public boolean numeroEnvolvido(String numero) {
        return numero.equals(numeroOrigem) || numero.equals(numeroDestino);
    }
    
    public float getValorTotal() {
        return valorTotal;
    }
    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public String getLocalDestino() {
        return localDestino;
    }

}
