/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Maxime
 */
class SalleComp {
    int idSalle;
    List<Date> datesOccupees = new ArrayList<Date>();

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public List<Date> getDatesOccupees() {
        return datesOccupees;
    }

    public void setDatesOccupees(List<Date> datesOccupees) {
        this.datesOccupees = datesOccupees;
    }
    
}
