/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imutabilidade;

import java.util.Calendar;

/**
 *
 * @author eduardoasilvestre
 */
public final class CAula {

    private final Calendar inicio;
    private final Calendar fim;

    public CAula(Calendar inicio, Calendar fim) {
        this.inicio = (Calendar) inicio.clone();
        this.fim = (Calendar) fim.clone();
    }

    public Calendar getInicio() {
        return (Calendar) inicio.clone();
    }

    public Calendar getFim() {
        return (Calendar) fim.clone();
    }
}
