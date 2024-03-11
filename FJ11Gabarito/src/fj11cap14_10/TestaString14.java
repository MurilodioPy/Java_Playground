/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap14_10;

public class TestaString14 {

    public static void main(String[] args) {
        String palavra = "Socorram-me, subi no ônibus em Marrocos";
        String[] palavras = palavra.split(" ");

        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.print(palavras[i] + " ");
        }

    }
}
