/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap16_05;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    @Override
    public int compareTo(ContaCorrente outra) {
        if (this.saldo < outra.saldo) {
            return -1;
        }
        if (this.saldo > outra.saldo){
            return 1;
        }
        return 0;
    }

}
