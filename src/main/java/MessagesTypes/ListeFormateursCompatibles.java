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
public class ListeFormateursCompatibles  implements Serializable{
    int idInstance;
    List<FormateurComp> formateursCompatibles = new ArrayList<FormateurComp>();

    public int getIdInstance() {
        return idInstance;
    }

    public void setIdInstance(int idInstance) {
        this.idInstance = idInstance;
    }

    public List<FormateurComp> getFormateursCompatibles() {
        return formateursCompatibles;
    }

    public void setFormateursCompatibles(List<FormateurComp> formateursCompatibles) {
        this.formateursCompatibles = formateursCompatibles;
    }

    @Override
    public String toString() {
        return "ListeFormateursCompatibles{" + "idInstance=" + idInstance + ", formateursCompatibles=" + formateursCompatibles + '}';
    }
    
}
