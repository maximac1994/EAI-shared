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
public class CodeFormationMessage implements Serializable {
    
    private String codeFormation;

    public CodeFormationMessage(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    @Override
    public String toString() {
        return "CodeFormation{" + "codeFormation=" + codeFormation + '}';
    }
    
}
