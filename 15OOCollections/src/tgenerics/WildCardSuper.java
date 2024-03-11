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
// Lower Bounded Wildcards
/*
Ao contrário do extends, o wildcard super permite que elementos Fruit 
e Object sejam utilizados, isso significa que apenas são permitidos 
de “Fruit para cima”. Se fizermos um List estamos permitindo todos os
Apples, Fruits e Objects.
 */
public class WildCardSuper {

    public void processElements(List<? super Fruit> elements) {
        System.out.println(elements);
    }

    public WildCardSuper() {
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

        List<Object> listObject = new ArrayList<Object>();
        Object o1 = new Object();

        Object o2 = new Object();

        listObject.add(o1);
        listObject.add(o2);
        processElements(listObject);
        
        //teste o comportamento a seguir
        /*
        List<Apple> listApple = new ArrayList<Apple>();
        processElements(listApple);

        List<Orange> listOrange = new ArrayList<Orange>();
        processElements(listOrange);

        List<Strawberry> listStrawberry = new ArrayList<Strawberry>();
        processElements(listStrawberry);
        */
    }

    public static void main(String[] args) {
        new WildCardSuper();
    }
}
