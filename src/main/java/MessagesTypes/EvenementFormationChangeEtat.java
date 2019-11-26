/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jerom
 */
public abstract class EvenementFormationChangeEtat extends EvenementFormation {
    
    Date dateDebut;
    int duree;

    public Date getDateDebut() {
        return dateDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    
}
