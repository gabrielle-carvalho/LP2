abstract class Seguro {
    private String beneficiario;
    private float valorApolice;

    public Seguro(String beneficiario, float valorApolice) {
        this.beneficiario = beneficiario;
        this.valorApolice = valorApolice;
    }
    
    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public float getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(float valorApolice) {
        this.valorApolice = valorApolice;
    }
    
    public abstract float calcValor();
    
    public interface print implements {
        void imprimir();
        void gerarPdf;
    }
    
    public static void main(String[] args) {
        SegResidencial s1;
        s1 = new SegResidencial("jese", 10000, "rua das flores", 2020);
        System.out.println("o valor é: " + s1.calcValor());
    }
}
