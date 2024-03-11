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
public class LocalInnerClass1 {
//classe interna a um método
    public static void main(String[] args) {
        Outer7 o = new Outer7();
        o.see();
    }
}

class Outer7 {

    private int x = 10;

    public void see() {
        System.out.println("before " + x);
        class Inner {

            public Inner() {
                x = 0;
            }
        }
        System.out.println("after " + x);
    }
}
