/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap4_12;


public class teste {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Diego";
        f1.salario = 1000;
        f1.dataEntrada = "05/05/2022";
        f1.recebeAumento(500);

        Funcionario f2 = f1;
        f2.nome = "Diego";
        f2.salario = 1000;
        if (f1 == f2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
