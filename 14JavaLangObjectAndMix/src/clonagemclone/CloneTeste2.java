/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonagemclone;

import java.math.BigDecimal;

/**
 *
 * @author EDYA
 */
public class CloneTeste2 implements Cloneable {

    static long contadorPessoas;

    private long id;
    private String nome;
    private String cpf;
    private int idade;
    private BigDecimal salario;
    private char sexo;

    public CloneTeste2() {
        id = ++CloneTeste2.contadorPessoas;
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

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + ", sexo=" + sexo + '}';
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
    public CloneTeste2 clone() {
        try {
            CloneTeste2 b = (CloneTeste2) super.clone();
            return b;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        CloneTeste2 p1 = new CloneTeste2();
        p1.setNome("eduardo");
        p1.setIdade(20);

        CloneTeste2 p2 = p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("");

        p2.setIdade(25);

        System.out.println(p1);
        System.out.println(p2);

    }
}
