/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgenerics;

/**
 *
 * @author eduardoasilvestre
 */
public class CGenericClassObject {

    public static <T> T getInstance(Class<T> theClass)
            throws IllegalAccessException, InstantiationException {

        return theClass.newInstance();
    }

    public static <T> T read(Class<T> theClass, String sql)
            throws IllegalAccessException, InstantiationException {

        //execute SQL.
        T o = theClass.newInstance();
        //set properties via reflection.

        return o;
    }

    public CGenericClassObject() throws IllegalAccessException, InstantiationException {
        String string = getInstance(String.class);

        Fruit fruit = getInstance(Fruit.class);

        Apple apple = read(Apple.class, "select * from apple where id=1");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        new CGenericClassObject();
    }
}
