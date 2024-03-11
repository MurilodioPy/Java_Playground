/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src1;

/**
 *
 * @author EDYA
 */
public class KIntroAStatic2 {
    /*static*/
    int fibo(int n) {
         if (n == 0) {
            return 0;
         } else if (n == 1) {
            return 1;
        } else {
            return fibo(n-1) + fibo (n-2);
        }
    }
    public static void main(String[] args) {
        KIntroAStatic2 f = new KIntroAStatic2();
        System.out.println(f.fibo(6));
        
        /*
        System.out.println(fibo(6));
        */
    }
}
