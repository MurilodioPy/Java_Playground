/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src1;

/**
 *
 * @author eduardoasilvestre
 */
public class KIntroAStatic1 {
    public static void main(String[] args) {
        //funciona porque dentro da main 
        //só é possível chamar diretamente elementos static
        metodoStatic();
        
        //metodoNaoStatic();
        
        KIntroAStatic1 k = new KIntroAStatic1();
        k.metodoNaoStatic();
        k.metodoStatic(); //warning
    }
    
    void metodoNaoStatic() {
        
    }
    
    static void metodoStatic() {
        
    }
}
