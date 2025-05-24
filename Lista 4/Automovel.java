public class Automovel{
    protected String placa, anoFabricacao;

    public Automovel (String placa, String anoFabricacao){
        this.placa=placa;
        this.anoFabricacao=anoFabricacao;
    }

    public void setPlaca(String placa){
        this.plca=placa;
    }

    public void setAnoFabricacao(String anoFabricacao){
        this.anoFabricacao=anoFabricacao;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getAnoFabricacao(){
        return this.anoFabricacao;
    }
}