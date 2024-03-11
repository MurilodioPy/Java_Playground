/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author eduardoasilvestre
 */
public class BGenericMethod {

    public <T> T addAndReturn(T element, Collection<T> collection) {
        collection.add(element);
        return element;
    }

    public BGenericMethod() {
        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();

        String theElement1 = addAndReturn(stringElement, stringList);

        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();

        Integer theElement2 = addAndReturn(integerElement, integerList);
    }

    public static void main(String[] args) {
        new BGenericMethod();
    }
}
