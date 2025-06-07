/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administrador;

/**
 *
 * @author 072410142
 */
public class Compra {
    private String data;
    private Cartao meuCartao;
    float valorTotal;
    int pontos, parcela;

    public Compra(String data, Cartao meuCartao, float valorTotal, int pontos, int parcela) {
        this.data = data;
        this.meuCartao = meuCartao;
        this.valorTotal = valorTotal;
        this.pontos = pontos;
        this.parcela = parcela;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cartao getMeuCartao() {
        return meuCartao;
    }

    public void setMeuCartao(Cartao meuCartao) {
        this.meuCartao = meuCartao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }
    
    
}
