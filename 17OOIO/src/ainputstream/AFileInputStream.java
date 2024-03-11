/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ainputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author EDYA
 */

public class AFileInputStream {
    public static void main(String[] args) throws IOException  { //CHECKED EXCEPTION
        InputStream is = new FileInputStream("src/files/arquivo.txt");
        int b = is.read();
        System.out.println(b);
        System.out.println((char)b);
        
 }
}
