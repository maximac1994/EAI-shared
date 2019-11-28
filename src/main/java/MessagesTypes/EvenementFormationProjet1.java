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
public class EvenementFormationProjet1 extends EvenementFormation {
    int idFormation;

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    @Override
    public String toString() {
        return super.toString() + "EvenementFormationProjet1{" + "idFormation=" + idFormation + '}';
    }
    
    
    
}
