/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscanner;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author EDYA
 */
public class BEnconding {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] codes = {"ISO-8859-1", "UTF-8", "UTF-16"};
        String palavra = "ç";

        for (String encoding : codes) {
            byte[] b = palavra.getBytes(encoding);
            System.out.printf("%10s\t%d\t", encoding, b.length);
            for (int k = 0; k < b.length; k++) {
                String hex = Integer.toHexString((b[k] + 256) % 256);
                if (hex.length() == 1) {
                    hex = "0" + hex;
                }
                System.out.print(hex);
            }
            System.out.println();
        }
    }
}
