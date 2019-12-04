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
    int duree;
    List<SalleComp> listeSallesComp = new ArrayList<SalleComp>();

    public int getIdInstance() {
        return idInstance;
    }

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public List<SalleComp> getListeSallesComp() {
        return listeSallesComp;
    }

    public void setListeSallesComp(List<SalleComp> listeSallesComp) {
        this.listeSallesComp = listeSallesComp;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "ListeSallesCompatibles{" + "idInstance=" + idInstance + ", duree=" + duree + ", listeSallesComp=" + listeSallesComp + '}';
    }
    
    
}
