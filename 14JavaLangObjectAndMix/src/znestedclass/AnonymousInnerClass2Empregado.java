/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package znestedclass;

/**
 *
 * @author eduardoasilvestre
 */
//superclasse Empregado com a acao trabalhar
public class AnonymousInnerClass2Empregado {
    public static void main(String[] args) {
        AnonymousInnerClass2Empregado a = new AnonymousInnerClass2Empregado();
        a.trabalhar();
        
        QuadroFuncionario q = new QuadroFuncionario();
        q.mgr.trabalhar();
        q.peao.trabalhar();
    }

    public void trabalhar() {
        System.out.println("trabalhar");
    }
}

class QuadroFuncionario {
    AnonymousInnerClass2Empregado mgr = new AnonymousInnerClass2Empregado() {
        public void trabalhar() {
            System.out.println("mandar");
        }
    };

    AnonymousInnerClass2Empregado peao = new AnonymousInnerClass2Empregado() {
        public void trabalhar() {
            System.out.println("executar");
        }
    };
}
