/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap3_13;


public class exercicio6 {

    public static void main(String[] args) {

        int atual = 0;
        int anterior = 1;
        int fibonacci = 0;

        while (fibonacci <= 100) {
            if (fibonacci == 0) {
                System.out.print(fibonacci + ",");
            }
            fibonacci = atual + anterior;
            System.out.print(fibonacci + ",");
            anterior = atual;
            atual = fibonacci;
        }
    }

}
