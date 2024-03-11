/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecreatingexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDYA
 */
public class TesteContaChecked {

    public static void main(String[] args)  /*throws SaldoInsuficienteExceptionChecked*/{
        try {
            //metodo();
            metodo1();
        } catch (SaldoInsuficienteExceptionChecked ex) {
            Logger.getLogger(TesteContaChecked.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/*
    private static void metodo() {
        ContaChecked cc = new ContaChecked();
        cc.deposita(50);

        cc.saca(100);

    }*/
    
    
    private static void metodo1() throws SaldoInsuficienteExceptionChecked /*throws SaldoInsuficienteExceptionChecked*/ {
        ContaChecked cc = new ContaChecked();
        cc.deposita(50);
        try {
            cc.saca(100);
        } catch (SaldoInsuficienteExceptionChecked e) {
            System.out.println(e.getMessage());
        }
        
        //TODO uncomment
        cc.saca(100);
    }
}
