/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazefechaautocloseable;

/**
 *
 * @author eduardoasilvestre
 */
public class FazEFecha implements AutoCloseable{

    
    public  void faz() {
    System.out.println("faz qualquer coisa");
}

    @Override
    public void close() throws Exception {
        
    }
}
