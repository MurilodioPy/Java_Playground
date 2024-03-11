/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epacoteabstrato;
/**
 *
 * @author EDYA
 */
public class BTeste {
    //funcionario: 10%
    //gerente: 15%
    //diretor: 20%
    //secretaria: 7%
    //

    public static void main(String[] args) {
        BControleDeBonificacoes c = new BControleDeBonificacoes();

        BGerente g = new BGerente();
        g.salario = 1000;
        
        BSecretaria s = new BSecretaria();
        s.salario = 1000;
        
        BDiretor d = new BDiretor();
        d.salario = 1000;
        
                
        c.registra(g);
        c.registra(s);
        c.registra(d);
        
        
        
        System.out.println("\nTotal de bonificações: " + c.getTotalDeBonificacoes());
        
        //E se criasse o BDiretor a partir de BGerente (classe simples)
        
    }
}
