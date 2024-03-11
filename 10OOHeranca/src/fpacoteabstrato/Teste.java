/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpacoteabstrato;

import dpacoteabstrato.*;

/**
 *
 * @author EDYA
 */
public class Teste {

    public static void main(String[] args) {
        
        Funcionario f = new SecretariaAdministrativa();
        ControleDeBonificacoes c = new ControleDeBonificacoes();

        Gerente g = new Gerente();
        g.salario = 1000;
        
        Gerente d = new Diretor();
        g.salario = 1000;
        
        Secretaria s = new SecretariaAdministrativa();
        s.salario = 1000;
        
        c.registra(g);
        c.registra(d);
        c.registra(s);
        
        System.out.println("\nTotal de bonificações: " + c.getTotalDeBonificacoes());
    }
}
