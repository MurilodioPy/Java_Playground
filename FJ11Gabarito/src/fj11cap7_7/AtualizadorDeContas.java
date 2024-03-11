/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap7_7;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void roda(Conta c) {
        System.out.println("Saldo Anterior: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo Final: " + c.getSaldo());
        saldoTotal += c.getSaldo();
    }
}
