/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap14_10;


public class TestaGuardador {
    public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		guardador.adicionaObjeto(cc);
		
		Object object = guardador.pegaObjeto(0);
		
		Conta contaResgatada = (Conta) object; 
		
		System.out.println(contaResgatada.getSaldo());
		
		//Autoboxing
		Object obj = 123;
		guardador.adicionaObjeto(obj);
		
		System.out.println(guardador.pegaObjeto(1));
	   }
}
