/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonagemclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

/**
 *
 * @author eduardoasilvestre
 */
public class DeepCloneUtil {
    public static Object deepClone(Object object) {
	    try {
	      ByteArrayOutputStream baos = new ByteArrayOutputStream();
	      ObjectOutputStream oos = new ObjectOutputStream(baos);
	      oos.writeObject(object);
	      ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
	      ObjectInputStream ois = new ObjectInputStream(bais);
	      return ois.readObject();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	      return null;
	    }
	}
    
    public static void main(String[] args) {
        DeepCloneUtil dcu = new DeepCloneUtil();
        
        CloneTeste3Parametro cParametro = new CloneTeste3Parametro();
        cParametro.setId(10);
        cParametro.setN("qualquer");
        
        CloneTeste3 p1 = new CloneTeste3();
        p1.setNome("eduardo");
        p1.setIdade(20);
        p1.setcParametro(cParametro);
        
        CloneTeste3 p2 = (CloneTeste3)dcu.deepClone(p1);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("");
        
        p2.getcParametro().setN("novo nome");
        p2.setIdade(25);
        
        //repare o erro em p1 foi corrigido em "novo nome"
        System.out.println(p1);
        System.out.println(p2);
        
        
        
        
    }
}
