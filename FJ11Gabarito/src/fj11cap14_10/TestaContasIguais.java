/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap14_10;

public class TestaContasIguais {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaPoupanca conta2 = new ContaPoupanca();

        conta1.setNumero(123);
        conta2.setNumero(123);

        
        
        System.out.println(conta1.equals(conta2));

    }
}
