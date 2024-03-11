/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class CarregaDoArquivo {

    public CarregaDoArquivo() {
        apostas = new ArrayList();
    }
    private List<Aposta> apostas;

    public List<Aposta> getApostas() {
        return apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        this.apostas = apostas;
    }
    
    

    public List<Aposta> carregaApostas(String arquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String separadas[] = linha.split(" ");
                Aposta a = new Aposta();

                a.setNome(separadas[0]);

                for (int i = 1; i < separadas.length; i++) {
                    a.getNumeros()[i-1] = Integer.parseInt(separadas[i]);

                }
                apostas.add(a);
            }

        }

        return apostas;

    }

    public Map<Integer, Integer> criaMapa() {

        Map<Integer, Integer> map = new HashMap();
        for (int i = 1; i <= 60; i++) {
            map.put(i, 0);
        }

        for (Aposta aposta : apostas) {
            for (int numero : aposta.getNumeros()) {

                int vezesJogado = map.get(numero);
                map.put(numero, ++vezesJogado);
            }
        }
        return map;
    }

}
