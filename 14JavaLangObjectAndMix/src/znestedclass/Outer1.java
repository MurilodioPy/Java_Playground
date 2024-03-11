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
public class Outer1 {
      public static void main(String[] args) {
      /*a classe interna não pode ser instanciada sem que seja 
        por um objeto da classe externa*/
      Outer1 o = new Outer1();
      Inner i = o.new Inner();
}

   class Inner {
   }
}
