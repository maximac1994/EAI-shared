/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.util.Date;

/**
 *
 * @author jerom
 */
public class EvenementFormationProjet2 extends EvenementFormation {

        
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
    
    @Override
    public String toString() {
        return "EvenementFormationProjet2{" + "dateDebut=" + dateDebut + ", duree=" + duree + '}';
    }
    
}
