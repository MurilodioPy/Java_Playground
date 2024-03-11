/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imutabilidade;
/**
Criando classe imutável
Para que uma classe seja considerada imutável em java ela deve seguir as seguintes características:
*Métodos não podem modificar seu estado
*Definida como final
*Atributos devem ser privados
*Atributos devem ser final
*Caso sua classe tenha composição com objetos mutáveis, 
* eles devem ter acesso exclusivo pela sua classe, 
* devolvendo cópias defensivas
 */

/**
CRIANDO CLASSES IMUTÁVEIS
https://medium.com/@rafaelvicio/trabalhando-com-imutabilidade-no-java-a4225fbddefc
https://www.devmedia.com.br/o-reflexo-da-imutabilidade-no-codigo-limpo/30697
https://robsoncastilho.com.br/2013/11/10/trabalhando-com-value-objects/
https://imasters.com.br/back-end/pensamento-funcional-imutabilidade
https://github.com/caelum/apostila-oo-avancado-em-java/blob/master/10-um-pouco-de-imutabilidade-e-encapsulamento.md
https://www.ti-enxame.com/pt/java/faca-objeto-java-imutavel/1040862163/
https://www.baeldung.com/java-immutable-list
*/

/**
MODELO RICO x MODELO ANÊMICO
https://www.alura.com.br/artigos/o-que-e-modelo-anemico-e-por-que-fugir-dele
https://dev.to/wsantosdev/design-modelos-anemicos-e-modelos-ricos-4k8f
https://bar8.com.br/abap-modelo-an%C3%AAmico-6fdb3978d11e
https://deviq.com/
 */
public final class BAluno {

    private final String nome;

    public BAluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    //só foi colocado aqui para dar destaque
    //classe não precisa ser executada
    public static void main(String[] args) {
        
    }
}
