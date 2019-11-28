/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Maxime
 */
public class EvenementFormationAnnulation extends EvenementFormation {
    
    Date dateDebut;
    int duree;
    List<String> mails;

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public List<String> getMails() {
        return mails;
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }

    @Override
    public String toString() {
        return "EvenementFormationAnnulation{" + "dateDebut=" + dateDebut + ", duree=" + duree + ", mails=" + mails + '}';
    }
    
}
