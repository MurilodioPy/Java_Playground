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
public class Static1 {

    private static int CountStatic = 0;
    private int CountNonStatic = 0;

    public static class Inner {

        public void doInner() {
            /*
             vantagem classe estática aninhada é poder acessar 
            membros privados da classe externa
             */

            /*
            Inner é estática então não pode 
            chamar diretamente a variável CountNonStatic
             */
            
            //Erro gerado: Erro de compilação: non-static variable CountNonStatic cannot be referenced from a static context
            //System.out.println( CountNonStatic );
            System.out.println(CountStatic);
        }
    }

    public static void main(String[] args) {
        //permitido chamar a classe interna
        Inner i = new Inner();
        i.doInner();

        //permitido instanciar a classe externa
        Static1 s = new Static1();

        //System.out.println( CountNonStatic );
        System.out.println(CountStatic);

        //chamar a classe interna a partir da externa (static)
        Static1.Inner si = new Static1.Inner();
        si.doInner();

    }
}
