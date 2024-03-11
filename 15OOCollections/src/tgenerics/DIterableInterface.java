/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgenerics;

import java.util.Iterator;

/**
 *
 * @author eduardoasilvestre
 */
public class DIterableInterface {

    public class MyCollection<E> implements Iterable<E> {

        public Iterator<E> iterator() {
            return new MyIterator<E>();
        }
    }

    public class MyIterator<T> implements Iterator<T> {

        public boolean hasNext() {

            //implement...
            return true;
        }

        public T next() {
            //implement...;
            return null;
        }

        public void remove() {
            //implement... if supported.
        }
    }

    public DIterableInterface() {
        MyCollection<String> stringCollection = new MyCollection();

        for (String string : stringCollection) {

        }

    }

    public static void main(String[] args) {
        new DIterableInterface();
    }

}
