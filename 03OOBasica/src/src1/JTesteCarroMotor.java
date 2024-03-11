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
public class JTesteCarroMotor {
    public static void main(String[] args) {
        JCarro c1 = new JCarro();
        c1.cor = "prata";
        c1.modelo = "palio";
        c1.velocidadeMaxima = 170;
        JMotor m1 = new JMotor();
        m1.tipo ="fire";
        m1.potencia = 80;
        c1.motor = m1;
        System.out.println(c1.motor.potencia);
        System.out.println(m1.potencia);
        
        
        JCarro c2 = new JCarro();
        c2.cor = "vermelho";
        c2.modelo = "punto";
        c2.velocidadeMaxima = 170;
        c2.motor = new JMotor();
        c2.motor.potencia = 132;
        c2.motor.tipo = "etorq";
        
    }
}
