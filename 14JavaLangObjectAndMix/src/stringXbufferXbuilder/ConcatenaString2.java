/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringXbufferXbuilder;

/**
 *
 * @author EDYA
 */
 public class ConcatenaString2 {
     //http://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865       
         public static void main (String[] args){
               
               
               String strFinal = "";
               
               /*
                * Vamos concatenar 65536 vezes o caractere 'a',
                * então entenda que cada vez que passarmos no laço
                * a JVM irá criar um novo objeto em memória.
                * */
               for(int i = 0; i < 65536; i ++){
                      strFinal += "a";                  
               }
         }
  }
