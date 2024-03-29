/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.io.Serializable;

/**
 *
 * @author Maxime
 */
public class DemandeFormationMessage implements Serializable {
    
    int nbParticipants;
    String codeEntreprise;
    String nom;
    String codeFormation;
    int idFormation;
    String libelleFormation;
    int nbMin;
    int nbMax;
    int duree;
    String thematique;
    int niveau;
    
    public int getNbParticipants() {
        return nbParticipants;
    }

    public void setNbParticipants(int nbParticipants) {
        this.nbParticipants = nbParticipants;
    }

    public String getCodeEntreprise() {
        return codeEntreprise;
    }

    public void setCodeEntreprise(String codeEntreprise) {
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

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public int getNbMin() {
        return nbMin;
    }

    public void setNbMin(int nbMin) {
        this.nbMin = nbMin;
    }

    public int getNbMax() {
        return nbMax;
    }

    public void setNbMax(int nbMax) {
        this.nbMax = nbMax;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "DemandeFormationMessage{" + "nbParticipants=" + nbParticipants + ", codeEntreprise=" + codeEntreprise + ", nom=" + nom + ", codeFormation=" + codeFormation + ", idFormation=" + idFormation + ", libelleFormation=" + libelleFormation + ", nbMin=" + nbMin + ", nbMax=" + nbMax + ", duree=" + duree + ", thematique=" + thematique + ", niveau=" + niveau + '}';
    }
    
}
