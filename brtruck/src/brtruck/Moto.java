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
public class Moto extends Automovel {

    public Moto(int rodas) {
        super(rodas);
    }

    @Override
    public void StatusLigado() {

        System.out.println("Ligar Moto?(S/N)");
        Scanner resp = new Scanner(System.in);
        char resposta;

        resposta = resp.next().toUpperCase().toCharArray()[0];
        switch (resposta) {

            case 'S':
                this.statusLigado = true;
                System.out.println("Moto Ligada.");
                break;
            case 'N':
                this.statusLigado = false;
                System.out.println("Ok...");
                System.exit(0);

                break;

            default:
                System.out.println("Essa opção não é válida!");
        }
    }

    @Override
    public void Acelerar() {
        int resto;
        int i = 0;
        if (this.statusLigado == true && this.combustivel > 0) {

            do {
                System.out.println("O automóvel está acelerando...🏍 ");
                this.statusPneu = true;

                if (this.statusPneu == true && i <= 5) {
                    System.out.println("Status do Pneu: Cheio");
                    i++;
                } else if (this.statusPneu == true && i >= 5 && i <= 9) {
                    System.out.println("Status do Pneu: Murchando");
                    i++;

                } else if (this.statusPneu == true && i >= 10) {
                    i = 0;
                    this.statusPneu = false;
                    System.out.println("Status do Pneu: Furado");

                    this.statusLigado = false;
                    System.out.println("Moto Desligada.");
                    TrocarPneu();
                    this.statusPneu = true;

                }

                //Decrementando combustivel do Tanque
                int gas = this.combustivel--;
                resto = this.capacidadeTanque + gas;

                System.out.println("Combustível: " + resto);

                if (resto <= 3) {
                    Abastecer();
                }
            } while (resto != 0 && statusPneu == true);

            if (resto == 0) {
                this.statusLigado = false;
                if (this.statusLigado == false) {
                    System.out.println("O combustivel acabou! Moto desligada!");
                    System.out.println("☠Game Over☠");
                    System.exit(0);
                }
            }
        } else if (this.statusLigado == false) {
            System.out.println("Ligue sua moto primeiro!");
        }

    }

    @Override
    public void Abastecer() {
        System.out.println("⚠-⚠-⚠-COMBUSTÍVEL ACABANDO-⚠-⚠-⚠");
        System.out.println("Deseja abastecer?");
        Scanner resp = new Scanner(System.in);
        Scanner quantLitros = new Scanner(System.in);
        char resposta;

        resposta = resp.next().toUpperCase().toCharArray()[0];
        switch (resposta) {

            case 'S':
                this.statusLigado = false;
                System.out.println("Moto Desligada.");
                System.out.println("Quantos litros deseja abastecer?");
                quantidadeLitros = quantLitros.nextInt();
                System.out.println("🏍⛽------.-ABASTECENDO-.------⛽🏍");
                this.combustivel = this.combustivel + quantidadeLitros;
                this.statusLigado = true;
                System.out.println("Moto Ligada.");
                Acelerar();
                break;
            case 'N':
                this.statusLigado = true;
                Acelerar();
                break;

            default:
                System.out.println("Essa opção não é válida!");
        }
    }

    public void TrocarPneu() {
        System.out.println("Trocando Pneus!");
        this.statusPneu = true;
        System.out.println("Pneus trocados");
        this.statusLigado = true;
        System.out.println("Ligando Automóvel...");
    }

}
