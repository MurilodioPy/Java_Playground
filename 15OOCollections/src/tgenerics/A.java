/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgenerics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardoasilvestre
 */
/*
https://www.devmedia.com.br/usando-generics-em-java/28981
https://docs.oracle.com/javase/tutorial/java/generics/index.html
http://tutorials.jenkov.com/java-generics/index.html
https://www.baeldung.com/java-generics
https://howtodoinjava.com/java/generics/complete-java-generics-tutorial/
https://www.tutorialspoint.com/java/java_generics.htm
https://www.geeksforgeeks.org/generics-in-java/
https://www.geeksforgeeks.org/wildcards-in-java/

The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/


public class A {

    public static void main(String[] args) {
        /* COM GENERICS */
        List<Apple> box = new ArrayList();
        Apple apple = box.get(0);

        /* SEM GENERICS */
        List box1 =  new ArrayList();
        Apple apple1 = (Apple) box1.get(0);
        /*
        Se o objeto retornado de box.get(0) não puder
        ser convertido para Apple, só saberemos disso em tempo
        de execução
        */
        
        
        List<Orange> box2 = new ArrayList();
        //Apple apple = box2.get(0);
        /*
        Erro em tempo de compilação pois
        uma lista de Orange não pode ser atribuido a um
        objeto do tipo Apple. Isso porque ao fazer “box.get(0)”
        estamos retornando um Orange e não um Apple.
        */
        
        Apple a = new Apple();
        Fruit f = a;
        
        List<Apple> apples = new ArrayList();
        //List<Fruit> fruits = apples;
        //fruits.add(new Strawberry());
         /*
        O código acima está logicamente errado, pois antes 
        havíamos atributo a caixa de maças a caixa de frutas, 
        ou seja, nossa atual caixa de frutas na verdade é uma 
        caixa de maças, mas desta forma nada nos impede de colocar
        um moranga em uma caixa de frutas, isso porque, um morango
        também é uma fruta. É por este motivo que o Generic não
        permite esse tipo de atribuição. Podemos resumir isso tudo
        a apenas uma só frase: Generics são invariantes.
        */  
        
    }
}
