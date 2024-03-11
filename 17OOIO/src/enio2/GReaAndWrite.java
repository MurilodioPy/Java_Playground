/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author eduardoasilvestre
 */

public class GReaAndWrite {
    public static void main(String[] args) throws IOException {
        //cria o arquivo
        Path path = Files.createTempFile("test-file", ".txt");
        
        //escreve no arquivo
        Files.write(path, "line 1\nline 2\n".getBytes());
        
        //le todo o arquivo
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);   
        }
    }
}
