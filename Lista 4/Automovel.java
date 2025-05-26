public class Automovel{
    protected String placa, anoFabricacao;
    protected ArrayList<Passagem> minhasPassagens;

    public Automovel (String placa, String anoFabricacao){
        this.placa=placa;
        this.anoFabricacao=anoFabricacao;
        this.minhasPassagens = new ArrayList<Passagem>;
    }

    public void addPassagem (Passagem pass){
        this.minhasPassagens.add(pass);
    }

    public float passagem(){
        return 5;
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
