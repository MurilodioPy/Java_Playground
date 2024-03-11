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
public class Outer3 {
    /*Podemos ainda instanciar a classe interna fora da classe externa,
    porém seguindo a mesma regra de que isso deve ser feito através de
    um objeto da classe externa. 
    */
    /*
    A nossa classe TestOuter possui um método estático chamado main ,
    perceba que dentro deste método estamos criando o objeto Outer e
    a partir dele conseguimos criar o objeto Inner.
    */
   public static void main(String[] args) {
      Outer4 o = new Outer4();
      Outer4.Inner i = o.new Inner();
      i.faz();
   }
}
class Outer4 {
    class Inner {
        public void faz(){System.out.println("oi");}
    }
}
