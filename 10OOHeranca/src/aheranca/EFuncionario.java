/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author EDYA
 */
public class EFuncionario {

    protected String nome;
    protected String cpf;
    protected double salario;
    // métodos devem vir aqui
   
    //TESTE 1
    
    public double getBonificacao() {
        return this.salario * 0.10;
    }
    
    
    //TESTE 3
    
    public double retornaBonficacao() {
        return this.salario * 0.09;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
