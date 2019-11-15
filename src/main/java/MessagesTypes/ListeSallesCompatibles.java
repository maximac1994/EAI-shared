/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import entities.Salle;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jerom
 */
public class ListeSallesCompatibles implements Serializable {
    
    int idInstance;
    HashMap <Integer, List<Date>> sallesCompatibles = new HashMap <Integer, List<Date>>();

    public int getIdInstance() {
        return idInstance;
    }

    public HashMap<Integer, List<Date>> getSallesCompatibles() {
        return sallesCompatibles;
    }

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public void setSallesCompatibles(HashMap<Integer, List<Date>> sallesCompatibles) {
        this.sallesCompatibles = sallesCompatibles;
    }
    
    
    
}
