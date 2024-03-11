/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15ex2;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardoasilvestre
 */
public class GOrdenandoHashMap {

    public GOrdenandoHashMap() {
        // teste1();
        //teste2();
        //teste3();
        teste4();
    }

    private void teste1() {
        Map<Integer, Integer> mapaNomes = new HashMap();
        //número 5 apareceu 10 vezes
        mapaNomes.put(5, 10);
        mapaNomes.put(12, 15);
        mapaNomes.put(15, 17);
        mapaNomes.put(58, 4);

        ComparatorInts compInt = new ComparatorInts(mapaNomes);

        Map<Integer, Integer> mapaOrdenado = new TreeMap(compInt);
        mapaOrdenado.putAll(mapaNomes);

        List<Integer> removidos = new ArrayList();
        int i = 0;

        for (Integer valor : mapaOrdenado.keySet()) {
            System.out.println("NÚMERO: " + valor + "| VEZES: " + mapaNomes.get(valor));

        }

        System.out.println("\n");
        Jogo j = new Jogo(6);
        int numeros[] = new int[6];
        for (Integer valor : mapaOrdenado.keySet()) {
            System.out.println("NÚMERO: " + valor + "| VEZES: " + mapaNomes.get(valor));

            numeros[i++] = valor;

            removidos.add(valor);

        }
        j.setNumeros(numeros);
        j.setValorJogo(30);

        System.out.println(j);

    }

    private void teste2() {
        double valorArrecadado = 10000;
        List<Jogo> jogos = this.criaListaDeJogos(valorArrecadado);
        double somaTotal = 0;
        for (Jogo jogo : jogos) {
            somaTotal += jogo.getValorJogo();
            System.out.println(jogo);
        }
        System.out.println("Valor total jogado foi de " + somaTotal);
        System.out.println("Valor restante" + (somaTotal - valorArrecadado));

    }

    private void teste3() {
        //prepara a lista de apostas (arquivo, teclado)
        //prepara os números com a quantidade de números   
        double valorArrecadado = 10000;

        List<Jogo> jogos = this.criaListaDeJogos(valorArrecadado);
        //TENTAR CRIAR direto a partir desta estrutura
        //Map<Integer, Integer> mapaNomes = new LinkedHashMap();

        Map<Integer, Integer> mapaNomes = new HashMap();
        //número 5 apareceu 10 vezes
        mapaNomes.put(1, 13);
        mapaNomes.put(2, 15);
        mapaNomes.put(3, 17);
        mapaNomes.put(4, 4);
        mapaNomes.put(5, 4);
        mapaNomes.put(6, 4);
        mapaNomes.put(7, 4);
        mapaNomes.put(8, 15);
        mapaNomes.put(9, 17);
        mapaNomes.put(10, 9);
        mapaNomes.put(11, 10);
        mapaNomes.put(12, 1);
        mapaNomes.put(13, 5);

        //imprimeMap(mapaNomes);
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(mapaNomes.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        Map<Integer, Integer> mapaOrdenado = new LinkedHashMap();
        for (Map.Entry<Integer, Integer> aa : list) {
            mapaOrdenado.put(aa.getKey(), aa.getValue());
        }

        imprimeMap(mapaOrdenado);

        for (Jogo jogo : jogos) {
            for (int i = 0; i < jogo.getNumerosJogados(); i++) {
                jogo.getNumeros()[i] = pegaNumeroCorreto(mapaOrdenado);

            }
        }

        double somaTotal = 0;
        for (Jogo jogo : jogos) {
            somaTotal += jogo.getValorJogo();
            System.out.println(jogo);
        }
        System.out.println("Valor total jogado foi de " + somaTotal);
        System.out.println("Valor restante" + (somaTotal - valorArrecadado));

    }

    private void teste4() {

        //prepara a lista de apostas (arquivo, teclado)
        //prepara os números com a quantidade de números   
        double valorArrecadado = 2000;

        List<Jogo> jogos = this.criaListaDeJogos(valorArrecadado);
        //TENTAR CRIAR direto a partir desta estrutura
        //Map<Integer, Integer> mapaNomes = new LinkedHashMap();
        CarregaDoArquivo carregaDoArquivo = new CarregaDoArquivo();
        String arquivo = "apostas.txt";
        try {
            carregaDoArquivo.carregaApostas(arquivo);

        } catch (IOException ex) {
            Logger.getLogger(GOrdenandoHashMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map<Integer, Integer> mapaNomes = carregaDoArquivo.criaMapa();

        

        //imprimeMap(mapaNomes);
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(mapaNomes.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        Map<Integer, Integer> mapaOrdenado = new LinkedHashMap();
        for (Map.Entry<Integer, Integer> aa : list) {
            mapaOrdenado.put(aa.getKey(), aa.getValue());
        }

        imprimeMap(mapaOrdenado);

        for (Jogo jogo : jogos) {
            for (int i = 0; i < jogo.getNumerosJogados(); i++) {
                jogo.getNumeros()[i] = pegaNumeroCorreto(mapaOrdenado);

            }
        }

        double somaTotal = 0;
        for (Jogo jogo : jogos) {
            somaTotal += jogo.getValorJogo();
            System.out.println(jogo);
        }
        System.out.println("Valor total jogado foi de " + somaTotal);
        System.out.println("Valor restante" + (somaTotal - valorArrecadado));

    }

    private void imprimeMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("\n");
    }

    public int pegaNumeroCorreto(Map<Integer, Integer> map) {
        //System.out.println("size: " + map.size());
        Integer retorno = 0;
        if (map.size() > 0) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                retorno = entry.getKey();
                break;
            }
        } else {
            retorno = getRandomNumberInRange(1, 60);

        }
        if (map.size() > 0) {
            map.remove(retorno);
        }
        return retorno;

    }

    public static void main(String[] args) {
        new GOrdenandoHashMap();

    }

    public class ComparatorInts implements Comparator<Integer> {

        Map<Integer, Integer> base;

        public ComparatorInts(Map<Integer, Integer> base) {
            this.base = base;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            return base.get(o2).compareTo(base.get(o1));
        }
    }

    public List<Jogo> criaListaDeJogos(double valor) {
        double valorRestante = valor;
        List<Jogo> jogos = new ArrayList();

        while (valorRestante >= Probabilidade.SEIS_VALOR) {
            if (valorRestante >= Probabilidade.QUINZE_VALOR) {
                Jogo j = new Jogo(15);
                j.setValorJogo(Probabilidade.QUINZE_VALOR);
                jogos.add(j);

                valorRestante -= Probabilidade.QUINZE_VALOR;

            } else if (valorRestante >= Probabilidade.QUATORZE_VALOR) {
                Jogo j = new Jogo(14);
                j.setValorJogo(Probabilidade.QUATORZE_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.QUATORZE_VALOR;

            }
            if (valorRestante >= Probabilidade.TREZE_VALOR) {
                Jogo j = new Jogo(13);
                j.setValorJogo(Probabilidade.TREZE_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.TREZE_VALOR;

            }
            if (valorRestante >= Probabilidade.DOZE_VALOR) {
                Jogo j = new Jogo(12);
                j.setValorJogo(Probabilidade.DOZE_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.DOZE_VALOR;

            }
            if (valorRestante >= Probabilidade.ONZE_VALOR) {
                Jogo j = new Jogo(11);
                j.setValorJogo(Probabilidade.ONZE_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.ONZE_VALOR;

            }
            if (valorRestante >= Probabilidade.DEZ_VALOR) {
                Jogo j = new Jogo(10);
                j.setValorJogo(Probabilidade.DEZ_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.DEZ_VALOR;

            }
            if (valorRestante >= Probabilidade.NOVE_VALOR) {
                Jogo j = new Jogo(9);
                j.setValorJogo(Probabilidade.NOVE_VALOR);
                jogos.add(j);

                valorRestante -= Probabilidade.NOVE_VALOR;

            }
            if (valorRestante >= Probabilidade.OITO_VALOR) {
                Jogo j = new Jogo(8);
                j.setValorJogo(Probabilidade.OITO_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.OITO_VALOR;

            }
            if (valorRestante >= Probabilidade.SETE_VALOR) {
                Jogo j = new Jogo(7);
                j.setValorJogo(Probabilidade.SETE_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.SETE_VALOR;

            }
            if (valorRestante >= Probabilidade.SEIS_VALOR) {
                Jogo j = new Jogo(6);
                j.setValorJogo(Probabilidade.SEIS_VALOR);

                jogos.add(j);

                valorRestante -= Probabilidade.SEIS_VALOR;

            }

        }
        Collections.sort(jogos, new Comparator<Jogo>() {
            @Override
            public int compare(Jogo t, Jogo t1) {
                if (t.getNumerosJogados() > t1.getNumerosJogados()) {
                    return -1;
                }
                if (t.getNumerosJogados() < t1.getNumerosJogados()) {
                    return +1;
                }
                return 0;

            }
        });
        return jogos;

    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static int getRandomNumberInArray(int[] array) {

        Random r = new Random();
        int randomNumber = r.nextInt(array.length);
        return array[randomNumber];
    }
}
