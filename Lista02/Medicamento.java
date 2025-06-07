public class Medicamento
{
   private String nome, principioAtivo;
   private float precoCusto;
   private Fabricante produtor; //chama objeto da clase fabricante, tendo acesso a tudo
   
   public Medicamento(String nome, String principioAtivo, float precoCusto, Fabricante produtor){
        this.nome=nome;
        this.principioAtivo=principioAtivo;
        this.precoCusto=precoCusto;
        this.produtor= produtor;
    }
    
    public Medicamento(String nome, float precoCusto){
        this(nome, nome, precoCusto, null); //chama o construtor da mesma classe
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setPrincipioAtivo(String principioAtivo){
        this.principioAtivo=principioAtivo;
    }
    
    public void setPrecoCusto(float precoCusto){
        this.precoCusto=precoCusto;
    }
    
    public void setProdutor(Fabricante produtor){
        this.produtor=produtor;
    }
    
    public float CalcPrecoVenda(){
        float perc;
        perc=produtor.getPercLucro();
        return this.CalcPrecoVenda(perc);
    }

   public float CalcPrecoVenda(float perc){
      return precoCusto * (1+perc/100);
   }
    
}
