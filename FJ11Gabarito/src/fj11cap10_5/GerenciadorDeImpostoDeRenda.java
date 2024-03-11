/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap10_5;

public class GerenciadorDeImpostoDeRenda {

    private double total;

    public double getTotal() {
        return this.total;
    }

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando tributável: " + t);
        this.total += t.calculaTributos();
    }
}
