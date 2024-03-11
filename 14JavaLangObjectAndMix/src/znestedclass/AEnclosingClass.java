/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package znestedclass;

/**
 * A palavra “aninhadas” em programação diz respeito que é uma 
 * subrotina encapsulada noutra. O escopo da subrotina aninhada é 
 * limitado a subrotina que a encapsula. Isso significa que ela pode
 * ser chamada somente pela subrotina que a encapsula, ou pelas 
 * subrotinas diretamente ou indiretamente aninhadas pela mesma 
 * subrotina encapsuladora. O aninhamento é teoricamente ilimitado, 
 * ainda que na prática somente alguns níveis são aceitos, o que 
 * depende da implementação.
 * 
 * Classes Aninhadas são dividas em quatro categorias: 
 * (i)Estática, (ii) Não-Estática (Interna Comum), 
 * (iii) Interna a um método (local) e (iv) Interna Anônima.
 * 
 * Porque usar classes aninhadas?
 * Agrupamento de classes que são usadas em apenas um lugar
 * Aumento de Encapsulamento
 * Código mais legível e de fácil manutenção
 * 
 * https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 * https://www.devmedia.com.br/classes-anonimas-e-aninhadas-em-java/31167
 * https://www.geeksforgeeks.org/anonymous-inner-class-java/
 * @author eduardoasilvestre
 */
public class AEnclosingClass {
    /*Classes Aninhadas não estáticas tem acesso a membros privados
    da classe que a tem (classe externa), enquanto que classes 
    aninhadas estáticas não tem acesso aos membros da classe externa. 
    */
    
     public class InnerNestedClass {
     }
     static class StaticNestedClass {
        
    }
}

class X {
}
class Y {
}
/*
//não pode ser público
public class Z {
}
*/