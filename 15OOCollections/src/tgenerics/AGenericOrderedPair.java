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
public class AGenericOrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public AGenericOrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        AGenericOrderedPair<String, Integer> p1 = new AGenericOrderedPair<String, Integer>("Even", 8);
        AGenericOrderedPair<String, String>  p2 = new AGenericOrderedPair<String, String>("hello", "world");
        
        AGenericOrderedPair<String, AGenericClassBox<Integer>> p = new AGenericOrderedPair<>("primes", new AGenericClassBox<Integer>());
    }

}
interface Pair<K, V> {

        public K getKey();

        public V getValue();
}
