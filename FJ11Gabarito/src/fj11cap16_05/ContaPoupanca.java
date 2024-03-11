/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap16_05;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    @Override
    public int compareTo(ContaPoupanca o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }

}
