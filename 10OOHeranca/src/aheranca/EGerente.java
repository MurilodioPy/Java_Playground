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
public class EGerente extends EFuncionario {

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    //TESTE 2
    
     
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
   
    
    //TESTE 3
    /*
    @Override
    public double retornaBonficacao() {
        return this.salario * 0.08  + 1000;
    }
    */
    
    //TESTE 4
    /*
    @Override
    public double retornaBonficacao() {
        
        return super.retornaBonficacao() + 1000;
    }*/
  

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
