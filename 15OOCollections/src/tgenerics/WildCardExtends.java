/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgenerics;

import java.util.ArrayList;
import java.util.List;

/*
Código a seguir não funciona.
List<Apple> apples = ...;
List<Fruit> fruits = apples;
fruits.add(new Strawberry());

Uma maneira de resolver ele é através de Wildcards

Existem 3 tipos de Wildcards em Generics:
*Unknown Wildcard, ou seja, Wildcard desconhecido.
*Extends Wildcard
*Super wildcard
*/

// Upper Bounded Wildcards
/*
Podemos utilizar este tipo de Wildcard para possibilitar o uso de 
vários tipos que se relacionam entre si, ou seja, podemos dizer que
o nosso método processElements aceita uma lista de qualquer tipo de 
Frutas, seja moranga, maça ou etc. 
 */
public class WildCardExtends {

    public void processElements(List<? extends Fruit> elements) {
        for (Fruit a : elements) {
            System.out.println(a.getValue());
        }
    }

    public WildCardExtends() {
        /* Podemos agorar passar nossas frutas diversas ao método 
        processElements */
        List<Fruit> listFruit = new ArrayList<Fruit>();
        Fruit f1 = new Fruit();
        f1.setValue("x");
        Fruit f2 = new Fruit();
        f2.setValue("y");
        listFruit.add(f1);
        listFruit.add(f2);
        processElements(listFruit);

        List<Apple> listApple = new ArrayList<Apple>();
        processElements(listApple);

        List<Orange> listOrange = new ArrayList<Orange>();
        processElements(listOrange);

        List<Strawberry> listStrawberry = new ArrayList<Strawberry>();
        processElements(listStrawberry);

    }

    public static void main(String[] args) {
        new WildCardExtends();
    }
}
