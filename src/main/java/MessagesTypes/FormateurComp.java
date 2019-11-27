/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Maxime
 */
public class FormateurComp  implements Serializable{
    
    int idFormateur;
    List<Date> datesOccupees = new ArrayList<Date>();

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public List<Date> getDatesOccupees() {
        return datesOccupees;
    }

    public void setDatesOccupees(List<Date> datesOccupees) {
        this.datesOccupees = datesOccupees;
    }
    
}
