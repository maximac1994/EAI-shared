/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

/**
 *
 * @author Maxime
 */
public class DemandeFormationMessage {
    
    int nbParticipants;
    int codeEntreprise;
    String nom;
    String codeFormation;
    String libelleFormation;
    public int getNbParticipants() {
        return nbParticipants;
    }

    public void setNbParticipants(int nbParticipants) {
        this.nbParticipants = nbParticipants;
    }

    public int getCodeEntreprise() {
        return codeEntreprise;
    }

    public void setCodeEntreprise(int codeEntreprise) {
        this.codeEntreprise = codeEntreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getLibelleFormation() {
        return libelleFormation;
    }

    public void setLibelleFormation(String libelleFormation) {
        this.libelleFormation = libelleFormation;
    }
    
    
}
