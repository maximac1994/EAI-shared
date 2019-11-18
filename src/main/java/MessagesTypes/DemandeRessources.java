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
 * @author Maxime
 */
public class DemandeRessources implements Serializable {
    /*
        Message demandeRessources, type 
        ObjectMessage (idInstance, idFormation, 
        liste d’équipements nécessaires, liste de compétences nécessaires, 
        nbMax (nombre maximum de participants possible pour la formation)). 
        */
    
    int idInstance;
    int idFormation;
    List<Integer> equipementsNecessaires = new ArrayList<Integer>();
    List<CompetenceNec> competencesNecessaires = new ArrayList<CompetenceNec>();
    int nbMax;

    public int getIdInstance() {
        return idInstance;
    }

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public List<Integer> getEquipementsNecessaires() {
        return equipementsNecessaires;
    }

    public void setEquipementsNecessaires(List<Integer> equipementsNecessaires) {
        this.equipementsNecessaires = equipementsNecessaires;
    }

    public List<CompetenceNec> getCompetencesNecessaires() {
        return competencesNecessaires;
    }

    public void setCompetencesNecessaires(List<CompetenceNec> competencesNecessaires) {
        this.competencesNecessaires = competencesNecessaires;
    }

    public int getNbMax() {
        return nbMax;
    }

    public void setNbMax(int nbMax) {
        this.nbMax = nbMax;
    }
    
    
}
