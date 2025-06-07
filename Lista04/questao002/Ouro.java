/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administrador;

import java.util.ArrayList;

/**
 *
 * @author 072410142
 */
public class Ouro extends Cartao{
    
    public Ouro(String codPrinc, String codSec, String dataExpd, String dataValidade, float limite, int pontos, ArrayList<Compra> compras) {
        super(codPrinc, codSec, dataExpd, dataValidade, limite, pontos, compras);
    }
    
}
