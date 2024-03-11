/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cstatic;

/**
 *
 * @author eduardoasilvestre
 */
//https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065
/*
Um bloco estático é executado somente uma vez, imediatamente após
a primeira referencia a class, isto é, no carregamento da memória.

Como o bloco de estático é executado no carregamento da classe,
consequentemente será executado antes da chamada ao construtor da 
classe. Dentro de um bloco de código estático poderemos acessar 
somente atributos e métodos estáticos.
*/

public class CEstatica {

    public static String SO;
    public static String versaojava;
    public int num = 0;
    public static double[] aleatorios = new double[10];
    //rotina de pré-configuração da classe
    static {
        SO = System.getProperty("os.name");
        System.out.println(SO);
        versaojava = System.getProperty("java.version");
        System.out.println(versaojava);
        float versao = Float.valueOf(versaojava.substring(0, 3));
        if (versao < 1.5) {
            System.out.println("Instale uma versão 1.5 ou mais recente da JVM.");
            System.exit(1);
        }
        System.out.println(System.getProperties());
    }

    static {
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = Math.random();
        }
    }

    public static void Imprime() {
        System.out.println("metodo estatico Imprime sendo executado");
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.println(aleatorios[i]);
        }
    }
    
    public static void main(String[] args) {
       CEstatica.Imprime();
    }
}
