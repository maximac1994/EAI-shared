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
public class SalleComp  implements Serializable{
    String  numeroSalle;
    List<Date> datesOccupees = new ArrayList<Date>();

    public String getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(String numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

   
    public List<Date> getDatesOccupees() {
        return datesOccupees;
    }

    public void setDatesOccupees(List<Date> datesOccupees) {
        this.datesOccupees = datesOccupees;
    }

    @Override
    public String toString() {
        return "SalleComp{" + "numeroSalle=" + numeroSalle + ", datesOccupees=" + datesOccupees + '}';
    }
    
}
