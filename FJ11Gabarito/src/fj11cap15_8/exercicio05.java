/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap15_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class exercicio05 {

    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new FileInputStream("src/exerciciosfj11cap15_8/arquivo.txt");
        Scanner entrada = new Scanner(is);

        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
    }
}
