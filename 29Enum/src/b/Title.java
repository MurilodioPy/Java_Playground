/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author eduardoasilvestre
 */
public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms.");
    
    private final String title;

    private Title(String t) {
        title = t;
    }

    public String format(String last, String first) {
        return title + " " + first + " " + last;
    }

    public static void main(String[] args) {
        System.out.println(Title.MR.format("Doe", "John"));
    }

}
