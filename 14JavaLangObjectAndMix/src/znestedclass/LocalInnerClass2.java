/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package znestedclass;

/**
 *
 * @author eduardoasilvestre
 */
public class LocalInnerClass2 {
//classe interna ao construtor
    public static void main(String[] args) {
        Outer8 o = new Outer8();
        o.see();
    }
}

class Outer8 {

    private int x = 10;

    public void see() {
        System.out.println("before " + x);
        class Inner {

            public Inner() {
                x = 0;
            }
        }
        /*
        uma classe Interna a um método, só pode ser instanciada 
        dentro deste próprio método
        */
        Inner i = new Inner();
        System.out.println("after " + x);
    }
}
