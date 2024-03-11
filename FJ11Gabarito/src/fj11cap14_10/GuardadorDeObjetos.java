/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap14_10;


public class GuardadorDeObjetos {

    private Object[] arrayDeObjetos = new Object[100];
    private int posicao = 0;

    public void adicionaObjeto(Object object) {
        this.arrayDeObjetos[this.posicao] = object;
        this.posicao++;
    }

    public Object pegaObjeto(int indice) {
        return this.arrayDeObjetos[indice];
    }
}
