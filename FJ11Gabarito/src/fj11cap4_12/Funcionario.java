/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap4_12;

import java.util.Date;


public class Funcionario {

    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Depertamento: " + this.departamento);
        System.out.println("Data da entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Salário atual: " + this.salario);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual());
    }
}
