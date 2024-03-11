/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

/**
 *
 * @author eduardoasilvestre
 */
public class Animal {
//classe com muitos IF's
  //https://www.baeldung.com/java-replace-if-statements
    public void fazerBarulho(String animal) {
        if (animal.equals("Cachorro")) {
            System.out.println("Au Au");
        } else if (animal.equals("Galinha")) {
            System.out.println("Có Có");
        } else if (animal.equals("Vaca")) {
            System.out.println("Muuuu");
        } else {
            System.out.println("Animal não identificado.");
        }
    }
    
    public void fazerBarulhoSwitch(String animal) {
        if (animal.equals("Cachorro")) {
            System.out.println("Au Au");
        } else if (animal.equals("Galinha")) {
            System.out.println("Có Có");
        } else if (animal.equals("Vaca")) {
            System.out.println("Muuuu");
        } else {
            System.out.println("Animal não identificado.");
        }
    }
}
