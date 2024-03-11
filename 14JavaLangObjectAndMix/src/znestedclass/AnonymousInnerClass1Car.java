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
//superclasse carro
public class AnonymousInnerClass1Car {
   public void run() {
       System.out.println("acelera carro"); 
   }
   
    public static void main(String[] args) {
        AnonymousInnerClass1Car a = new AnonymousInnerClass1Car();
        a.run();
        
        Gol g = new Gol();
        g.car.run();
    }
}

/*
classe anônima nada mais é do que a herança de determinada classe
em um local exclusivo, ou seja, apenas naquele determinado ponto eu
preciso redefinir minha classe-pai.
*/       

class Gol {
    AnonymousInnerClass1Car car = new AnonymousInnerClass1Car() {
       public void run() { System.out.println("acelera gol"); }
    };
}
