/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap16_05;


public class TestaDeposita {

    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        try {
            cp.deposita(-1000);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

}
