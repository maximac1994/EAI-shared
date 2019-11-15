/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import entities.Equipement;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jerom
 */
public class DemandeRessources implements Serializable {
    
    int idInstance;
    int idFormation;
    List<Equipement> listeE;
    //List<Competence> listeC;
    int nbMax;

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public void setListeE(List<Equipement> listeE) {
        this.listeE = listeE;
    }

    public void setNbMax(int nbMax) {
        this.nbMax = nbMax;
    }

    public int getIdInstance() {
        return idInstance;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public List<Equipement> getListeE() {
        return listeE;
    }

    public int getNbMax() {
        return nbMax;
    }
    
    
    
}
