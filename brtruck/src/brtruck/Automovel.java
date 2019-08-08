package brtruck;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public abstract class Automovel implements Interface {

    protected int rodas;
    public int quantidadeLitros = 0;
    protected boolean statusPneu;
    protected boolean acelerar;
    protected int capacidadeTanque = 15;
    protected int combustivel = 1;
    protected boolean statusLigado;

    public Automovel(int rodas) {
        this.rodas = rodas;
    }

    
    @Override
    public void StatusLigado() {
        
    }

    @Override
    public void Acelerar() {
        this.acelerar = false;

    }
    @Override
    public void StatusPneu(){
        this.statusPneu = true;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public boolean getStatusPneu() {
        return statusPneu;
    }

    public void setStatusPneu(boolean statusPneu) {
        this.statusPneu = statusPneu;
    }

}
