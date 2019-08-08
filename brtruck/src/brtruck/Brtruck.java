/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brtruck;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class Brtruck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = new Carro(4);
        Moto mota = new Moto(2);   
        Caminhao caminhao = new Caminhao(8);
        car.StatusLigado();
        car.Acelerar();
        //mota.StatusLigado();
        //mota.Acelerar();
        //caminhao.StatusLigado();
        //caminhao.Acelerar();
        
        
        
    }

}
