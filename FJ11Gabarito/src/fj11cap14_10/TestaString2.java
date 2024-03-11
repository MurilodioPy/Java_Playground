/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap14_10;


public class TestaString2 {

    public static void main(String[] args) {
        String s1 = "Curso de JAVA";
        String s2 = "JAVA";
        //Verifica se uma String se encontra dentro de outra
        System.out.println(s1.contains(s2));

        String s3 = "JAVA ";
        //Tira espaço em branco das pontas de uma String
        System.out.println(s3.trim());

        String s4 = "";
        //Saber se uma String está vazia
        System.out.println(s4.isEmpty());
        //Saber quantos caracteres tem uma String
        System.out.println(s1.length());
    }

}
