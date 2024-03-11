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

// Unbounded Wildcard
/*
Como você não sabe o tipo do objeto, você deve tratá-lo da forma 
mais genérica possível.
 */
public class WildCardUnknown {

    public static void main(String[] args) {
        new WildCardUnknown();

    }

    public void processElements(List<?> elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }

    public WildCardUnknown() {
        /* Podemos atribuir um list de qualquer tipo a nosso
        método, pois ele tem um tipo desconhecido/genérico */
        List<Fruit> listF = new ArrayList();

        List<String> listD = new ArrayList();

        processElements(listF);
        processElements(listD);
     }

}
