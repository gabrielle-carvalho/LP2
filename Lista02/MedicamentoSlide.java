public class MedicamentoSlide
{
   private String nome, principioAtivo;
   private float precoCusto;
   
   public Medicamento(String nome, String principioAtivo, float precoCusto){
        this.nome=nome;
        this.principioAtivo=principioAtivo;
        this.precoCusto=precoCusto;
    }
    public Medicamento(String nome, float precoCusto){
        this(nome, nome, precoCusto); //chama o construtor da mesma classe
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
    public float CalcPrecoVenda(float percentualLucro){
        float precoVenda;
        return this.precoCusto+(this.precoCusto*percentualLucro/100);
    }
    
    public float CalcPrecoVenda(){
        return this.CalcPrecoVenda(30);
    }
}
