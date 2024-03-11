/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingcollectionscomparator;

import acollections.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class DClasseAninhada {
    public DClasseAninhada() {
        metodo();

    }

    public static void main(String[] args) {
        new DClasseAninhada();
    }
    public void metodo() {
        List<String> lista = new ArrayList<>();
        lista.add("Sérgio");
        lista.add("Paulo");
        lista.add("Guilherme");
        System.out.println(lista);
        
        //opção a: CLASSE ANINHADA INTERNA ANÔNIMA
        Collections.sort(lista, comparador);
        System.out.println(lista);
        
        //opção b: CLASSE ANINHADA INTERNA ANÔNIMA
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                 return Integer.compare(t.length(), t1.length());
            }
        });
        
        System.out.println(lista);
    }
    
    Comparator<String> comparador = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    };

}
