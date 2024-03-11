/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap15_8;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Scanner entrada = new Scanner(is);
        OutputStream os = new FileOutputStream("saida2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        System.out.println("Digite sua mensagem:");

        while (entrada.hasNextLine()) {
            String linha = entrada.nextLine();
            bw.write(linha);
            bw.newLine();
        }
        bw.close();
        entrada.close();
    }
}
