/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author eduardoasilvestre
 */
public class Util {
    private static Jogador jogadorLogado = null;
    
    private static LocalDate diaAtual = LocalDate.of(12, Month.OCTOBER, 2022);

    public static Jogador getJogadorLogado() {
        return jogadorLogado;
    }

    public static void setJogadorLogado(Jogador jogadorLogado) {
        Util.jogadorLogado = jogadorLogado;
    }

    public static LocalDate getDiaAtual() {
        return diaAtual;
    }

    public static void setDiaAtual(LocalDate diaAtual) {
        Util.diaAtual = diaAtual;
    }
}
