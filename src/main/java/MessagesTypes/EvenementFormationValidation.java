/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jerom
 */
public class EvenementFormationValidation {
    
    Date dateDebut;
    int duree;
    List<String> mails;

    public Date getDateDebut() {
        return dateDebut;
    }

    public int getDuree() {
        return duree;
    }

    public List<String> getMails() {
        return mails;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }
    
    
}
