/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author 072410142
 */
public class Seguro {

    /**
     * @return the beneficiario
     */
    public String getBeneficiario() {
        return beneficiario;
    }

    /**
     * @param beneficiario the beneficiario to set
     */
    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    /**
     * @return the valorApolice
     */
    public float getValorApolice() {
        return valorApolice;
    }

    /**
     * @param valorApolice the valorApolice to set
     */
    public void setValorApolice(float valorApolice) {
        this.valorApolice = valorApolice;
    }
    private String beneficiario;
    private float valorApolice;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
