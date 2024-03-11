/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazefechaautocloseable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {
    public Teste() {
        try(FazEFecha f = new FazEFecha()) {
            f.faz();
        } catch (Exception ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        new Teste();
    }
}
