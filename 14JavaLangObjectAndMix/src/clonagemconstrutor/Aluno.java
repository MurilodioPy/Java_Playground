/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonagemconstrutor;

/**
 *
 * @author eduardoasilvestre
 */
public final class Aluno {

    private final String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public static void main(String[] args) {
        Aluno origem = new Aluno("eduardo");
        Aluno clonado = new Aluno(origem.getNome());

    }
}
