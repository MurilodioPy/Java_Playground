/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package znestedclass;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

/**
 * A vantagem de utilizar-se uma classe estática aninhada está no fato de poder
 * acessar membros privados da classe externa (que sejam estáticos também, é
 * claro).
 *
 * @author eduardoasilvestre
 */
public class StaticWeek {
    private int weeknr;
    private int year;

    public StaticWeek(int weeknr, int year) {
        this.weeknr = weeknr;
        this.year = year;
    }

    public Iterator getDays() {
        return new DayIterator(this);
    }

    public int getWeeknr() {
        return weeknr;
    }

    public int getYear() {
        return year;
    }

    public static class DayIterator implements Iterator {
        private int index = 0;
        private Calendar cal = null;

        DayIterator(StaticWeek aWeek) {
            /*a classe aninhada DayIterator não tem acesso aos membros da classe Week, 
            isso porque eles são membros de instância.*/
            //System.out.println(weeknr);
            
            cal = new GregorianCalendar();
            cal.clear();
            cal.set(Calendar.YEAR, aWeek.getYear());
            cal.set(Calendar.WEEK_OF_YEAR, aWeek.getWeeknr());
        }

        public boolean hasNext() {
            return index < 7;
        }

        public Object next() {
            cal.set(Calendar.DAY_OF_WEEK, index++);
            return cal.getTime();
        }

        public void remove() {
            // not implemented
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Semana:");
        int weeknr = Integer.parseInt(s.nextLine());
        
        System.out.println("Ano:");
        int year = Integer.parseInt(s.nextLine());
        
        StaticWeek wk = new StaticWeek(weeknr, year);
        
        for (Iterator i = wk.getDays(); i.hasNext();) {
            System.err.println(i.next());
        }

    }
}
