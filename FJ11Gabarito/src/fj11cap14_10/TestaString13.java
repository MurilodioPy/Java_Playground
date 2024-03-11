/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap14_10;

public class TestaString13 {

    public static void main(String[] args) {

        String palavra = "Socorram-me, subi no onibus em Marrocos";

        String s = palavra;
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

    }
}
