/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ainputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author EDYA
 */
public class CFileInputStream {
    //LEITURA DO TECLADO;
    public static void main(String[] args) throws IOException {
        //diretorio do projeto inicialmente
        InputStream is = System.in; //lê byte

        /*Para recuperar um caractere, precisamos traduzir os bytes com o encoding dado para o respectivo código
         unicode, isso pode usar um ou mais bytes.*/
        InputStreamReader isr = new InputStreamReader(is); //lê char

        /*A classe BufferedReader é um Reader que recebe outro Reader pelo construtor e concatena os
         diversos chars para formar uma String através do método readLine
         */
        BufferedReader br = new BufferedReader(isr); //lê string

        String s = br.readLine();
                /*
        Aqui, lemos apenas a primeira linha do arquivo. O método readLine devolve a linha que foi lida e muda
        o cursor para a próxima linha*/
        while (s != null) {
            System.out.println("Foi lido: " + s + "\n");
            s = br.readLine();
        }

        br.close();
    }
}
