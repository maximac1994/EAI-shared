/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagesTypes;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jerom
 */
public class EvenementFormationValidation extends EvenementFormationChangeEtat {
    
    List<String> mails;

    public List<String> getMails() {
        return mails;
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }
    
    
}
