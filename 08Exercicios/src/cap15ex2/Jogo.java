/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15ex2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author eduardoasilvestre
 */
public class Jogo {
    private static int serial=0;
    private int numeroJogo;
    private int numerosJogados;
    private int numeros[];
    private double valorJogo;
    
    public Jogo(int numerosJogados) {
        this.numeroJogo = ++serial;
        this.numerosJogados= numerosJogados;
        numeros = new int[this.numerosJogados];
    }

    public int getNumerosJogados() {
        return numerosJogados;
    }

    public void setNumerosJogados(int numerosJogados) {
        this.numerosJogados = numerosJogados;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public double getValorJogo() {
        return valorJogo;
    }

    public void setValorJogo(double valorJogo) {
        this.valorJogo = valorJogo;
    }

    public int getNumeroJogo() {
        return numeroJogo;
    }

    
    
    
    

    @Override
    public String toString() {
        String resultado = "";
        resultado += "JOGO " + this.numeroJogo +" - " + this.numerosJogados + 
                " NÚMEROS (" + this.valorJogo +" REAIS)";
                for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
            
        }
        return resultado;
    }

   
    
    
    
}
