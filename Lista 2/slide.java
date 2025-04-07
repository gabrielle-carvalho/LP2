public class Medicamento
{
   private String nome, principioAtivo;
   private float precoCusto;
   
   public Medicamento(String nome, String principioAtivo, float precoCusto){
        this.nome=nome;
        this.principioAtivo=principioAtivo;
        this.precoCusto=precoCusto;
    }
    public Medicamento(String nome, float precoCusto){
        this(nome, nome, precoCusto); // verificar se é assim pq tem o mesmo nome
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setprincipioAtivo(String principioAtivo){
        this.principioAtivo=principioAtivo;
    }
    
    public void setprecoCusto(float precoCusto){
        this.precoCusto=precoCusto;
    }
    public float CalcPrecoVenda(float percentualLucro){
        float precoVenda;
        return this.precoCusto*percentualLucro/100;
    }
    
    public float CalcPrecoVenda(){
        return this.CalcPrecoVenda(30);
    }
}
