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
public class AnonymousInnerClass3 {
    //método que espera uma implementação da interface
    public static void acao(Evento e) {
        e.clicar();
        e.arrastar();
    }

    public static void main(String[] args) {
        acao(new Evento() {
            public void clicar() {
                System.out.println("clicou");
            }

            public void arrastar() {
                System.out.println("arrastou");
            }
        });
    }

}
//criado uma interface, mas poderia ser em outro arquivo
interface Evento {
    public abstract void clicar();
    public abstract void arrastar();
}
