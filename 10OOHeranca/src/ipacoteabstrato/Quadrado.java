/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipacoteabstrato;

/**
 *
 * @author eduardoasilvestre
 */
public class Quadrado extends FiguraGeometrica{
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calculaArea() {
           return Math.pow(lado, 2);
    }

    public double getLado() {
        return lado;
    }
    
}
