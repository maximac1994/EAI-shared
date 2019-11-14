/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.io.Serializable;

/**
 *
 * @author Maxime
 */
public abstract class EvenementFormation implements Serializable{
    int idInstance;
    int idFormateur;
    String idSalle;

    public int getIdInstance() {
        return idInstance;
    }

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public String getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(String idSalle) {
        this.idSalle = idSalle;
    }

    @Override
    public String toString() {
        return "EvenementFormation{" + "idInstance=" + idInstance + ", idFormateur=" + idFormateur + ", idSalle=" + idSalle + '}';
    }
    
    
}
