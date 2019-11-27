/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.io.Serializable;

/**
 *
 * @author 33785
 */
public class ReponseExistenceFormation implements Serializable {
    
    private DemandeFormationMessage demandeFormationMessage;
    private boolean formationExists;

    public DemandeFormationMessage getDemandeFormationMessage() {
        return demandeFormationMessage;
    }

    public void setDemandeFormationMessage(DemandeFormationMessage demandeFormationMessage) {
        this.demandeFormationMessage = demandeFormationMessage;
    }

    public boolean isFormationExists() {
        return formationExists;
    }

    public void setFormationExists(boolean formationExists) {
        this.formationExists = formationExists;
    }

    @Override
    public String toString() {
        return "ReponseExistenceFormation{" + "demandeFormationMessage=" + demandeFormationMessage + ", formationExists=" + formationExists + '}';
    }
    
}
