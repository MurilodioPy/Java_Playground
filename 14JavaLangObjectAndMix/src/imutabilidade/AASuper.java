/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imutabilidade;

//https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065
/**
FINAL: pode ser aplicado em classes, métodos e atributos. 
* 
CLASSE: ao receber o modificador FINAL representa que 
chegou ao nível máximo de especialização e não poderá mais 
ser especializada. Um exemplo clássico de classe FINAL é a 
java.lang.String. 
* 
MÉTODO:  garante que este não será sobrescrito
* 
ATRIBUTO: os mesmos passam a ser constantes, ou seja, 
uma vez o atributo inicializado, não poderá ter o seu 
valor alterado
 */

public class AASuper {
    //observações: 1 a 6
    
    //1 - obriga a inicialização
    private final int var1 = 10;
    
    //2 - descomente para teste
    //private final int var2;
    

    
    public static void main(String[] args) {
        AASuper s = new AASuper();
        
        //3 - nao permite a mudanca (descomente)
        //s.var1 = 12;
    }
    
    //4 - método final
    public final double soma(int... x) {
        int r = 0;
        for (int i : x) {
            r+=i;
        }
        return r;
    }
    
}
