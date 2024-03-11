/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap7_7;

public class TestaBanco {

    public static void main(String[] args) {
        Banco b = new Banco(3);

        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        cc1.deposita(1000);
        cc2.deposita(2000);
        cp1.deposita(3000);

        b.adiciona(cc1);
        b.adiciona(cc2);
        b.adiciona(cp1);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        for (int i = 0; i < 3; i++) {
            adc.roda(b.pegaConta(i));
        }

        System.out.println(adc.getSaldoTotal());
    }

}
