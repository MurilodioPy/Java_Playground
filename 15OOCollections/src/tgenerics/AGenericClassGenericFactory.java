/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgenerics;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardoasilvestre
 */
public class AGenericClassGenericFactory<T> {

    Class theClass = null;

    public AGenericClassGenericFactory(Class theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws InstantiationException, IllegalAccessException {
        return (T) this.theClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        AGenericClassGenericFactory<Fruit> factory1
                = new AGenericClassGenericFactory<>(Fruit.class);
        Fruit myClassInstance = factory1.createInstance();
        
        myClassInstance.setValue("maça");
        System.out.println(myClassInstance.getValue());
    }
}
