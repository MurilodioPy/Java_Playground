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
public class Animal2 {

    public abstract class Animal {

        public abstract void barulho();
    }

    public class Cachorro extends Animal {

        public void barulho() {
            System.out.println("Au Au");
        }
    }

    public class Galinha extends Animal {

        public void barulho() {
            System.out.println("Có Có");
        }
    }

    public class Vaca extends Animal {

        public void barulho() {
            System.out.println("Muuuu");
        }
    }
    public Animal2() {
        Animal a = new Vaca();
        fazerBarulho(a);
    }
    public static void main(String[] args) {
       new Animal2();
    }

    public void fazerBarulho(Animal animal) {
        animal.barulho();
    }
}
