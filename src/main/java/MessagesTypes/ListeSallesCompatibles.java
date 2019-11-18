/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerom
 */
public class ListeSallesCompatibles implements Serializable {
    
    int idInstance;
    List<SalleComp> listeSallesOccupees = new ArrayList<SalleComp>();

    public int getIdInstance() {
        return idInstance;
    }

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public List<SalleComp> getListeSallesOccupees() {
        return listeSallesOccupees;
    }

    public void setListeSallesOccupees(List<SalleComp> listeSallesOccupees) {
        this.listeSallesOccupees = listeSallesOccupees;
    }
    
    
}
