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
public class Outer2 {

    /*Uma classe interna é considerada um membro da classe externa, 
    sendo esta um membro então deve ter acesso a todos os outros 
    membros da classe externa, sejam eles private ou não
    */
    private int x = 0;

    public static void main(String[] args) {
        Outer2 o = new Outer2();
        Inner i = o.new Inner();
        o.print1();
    }

    public void print1() {
        System.out.println("x before " + x);
        Inner i = new Inner();
        i.print2();
    }

    class Inner {

        public void print2() {
            /*a classe Inner usa o atributo “x” que foi declarado como 
            private na classe Outer, ou seja, ela tem acesso a mesma. 
            */
            x++;
            System.out.println("x after: " + x);
        }
    }

}
