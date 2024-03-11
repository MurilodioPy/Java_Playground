/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap7_7;

public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
}
