package com.mycompany.administrador;
import java.util.ArrayList;

public class Cartao {
    private String codPrinc, codSec, dataExpd, dataValidade;
    private float limite;
    private int pontos;
    private ArrayList<Compra> compras;

    public Cartao(String codPrinc, String codSec, String dataExpd, String dataValidade, float limite, int pontos, ArrayList<Compra> compras) {
        this.codPrinc = codPrinc;
        this.codSec = codSec;
        this.dataExpd = dataExpd;
        this.dataValidade = dataValidade;
        this.limite = limite;
        this.pontos = pontos;
        this.compras = new ArrayList<Compra>();
    }
    public abstract float gerarPontos;
    
    public void addCompra(Compra comp){
        compras.add(comp);
    }
    
    public float totalPontos(){
        float soma;
        for(Compra c : compras){
            soma+=c.getValorTotal()*gerarPontos;
        }
    }
    
    
    public String getCodPrinc() {
        return codPrinc;
    }

    public void setCodPrinc(String codPrinc) {
        this.codPrinc = codPrinc;
    }

    public String getCodSec() {
        return codSec;
    }

    public void setCodSec(String codSec) {
        this.codSec = codSec;
    }

    public String getDataExpd() {
        return dataExpd;
    }

    public void setDataExpd(String dataExpd) {
        this.dataExpd = dataExpd;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
}