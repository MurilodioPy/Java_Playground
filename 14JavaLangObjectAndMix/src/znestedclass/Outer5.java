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
public class Outer5 {
    /*
    A classe interna em alguns casos pode precisar referenciar 
    a classe externa, e isso é possível através da palavra 
    reservada “this”
    */
    public static void main(String[] args) {
        Outer6 o = new Outer6();
        Outer6.Inner i = o.new Inner();
        i.see();
    }
}

class Outer6 {

    private int x = 10;

    class Inner {

        public void see() {
            System.out.println(x);
            System.out.println(this); //estamos referenciando a classe Inner
            System.out.println(Outer6.this); //estamos referenciando a classe Outer6
        }
    }
}
