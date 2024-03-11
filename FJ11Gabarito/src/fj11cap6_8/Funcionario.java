/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap6_8;

import java.time.LocalDate;

public class Funcionario {

    private int identificador;
    private static int contadorDeFuncionarios;
    private String nome;
    private String departamento;
    private double salario;
    private LocalDate dataEntrada;
    private String rg;

    public Funcionario() {
        this.identificador = ++Funcionario.contadorDeFuncionarios;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.identificador = ++Funcionario.contadorDeFuncionarios;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }

    public void mostra() {
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data da entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Salário atual: " + this.salario);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual());
        System.out.println("##############################");
    }
}
