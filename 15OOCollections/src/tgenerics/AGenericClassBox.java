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
public class AGenericClassBox<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        AGenericClassBox<Integer> integerBox = new AGenericClassBox<Integer>();
        AGenericClassBox<String> stringBox = new AGenericClassBox<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }

}
