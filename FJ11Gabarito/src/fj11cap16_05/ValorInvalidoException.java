/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap16_05;



public class ValorInvalidoException extends RuntimeException {

    ValorInvalidoException(double valor) {
        super("Valor inválido: " + valor);
    }
}
