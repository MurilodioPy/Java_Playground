/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonagemclone;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author eduardoasilvestre
 */
public class CloneTeste3Parametro implements Serializable{
    private String n;
    private int id;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CParametro{" + "n=" + n + ", id=" + id + '}';
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.n);
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CloneTeste3Parametro other = (CloneTeste3Parametro) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.n, other.n)) {
            return false;
        }
        return true;
    }
    
    
}
