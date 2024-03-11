/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonagemclone;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author eduardoasilvestre
 */
public class CloneTeste3 implements Cloneable,Serializable{
    static long contadorPessoas;
    
    private long id;    
    private String nome;
    private String cpf;
    private int idade;
    private BigDecimal salario;
    private char sexo;
    
    private CloneTeste3Parametro cParametro;

    
    
    
    public CloneTeste3() {
        id = ++CloneTeste3.contadorPessoas;
    }
 
    /**
     * @return the id
     */
    public long getId() {
        return id;
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the salario
     */
    public BigDecimal getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
        toString();
    }

    
    public CloneTeste3Parametro getcParametro() {
        return cParametro;
    }

    public void setcParametro(CloneTeste3Parametro cParametro) {
        this.cParametro = cParametro;
    }

    @Override
    public String toString() {
        return "C{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + ", sexo=" + sexo + ", cParametro=" + cParametro + '}';
    }
    
    /*
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    */
    public CloneTeste3 clone() {
        try {
            CloneTeste3 b = (CloneTeste3) super.clone();
            return b;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    
    
    public static void main(String[] args) {
        
        CloneTeste3Parametro cParametro = new CloneTeste3Parametro();
        cParametro.setId(10);
        cParametro.setN("qualquer");
        
        CloneTeste3 p1 = new CloneTeste3();
        p1.setNome("eduardo");
        p1.setIdade(20);
        p1.setcParametro(cParametro);
        
        CloneTeste3 p2 = p1.clone();
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("");
        
        p2.getcParametro().setN("novo nome");
        p2.setIdade(25);
        
        //repare o erro em p1
        System.out.println(p1);
        System.out.println(p2);
        
        
        
    }
}
