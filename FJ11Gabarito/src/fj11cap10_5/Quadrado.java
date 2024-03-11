/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap10_5;

public class Quadrado implements AreaCalculavel {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double CalculaArea() {
        return this.lado * this.lado;
    }

}
