/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;
import java.io.*;
/**
 *
 * @author Nguy Minh Trong
 */
public class StatusReferencesPoint implements Serializable{
    private static final long serialVersionUID = 1L;
    private int ID;
    private String Tentinhtrangphuckhao;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTentinhtrangphuckhao() {
        return Tentinhtrangphuckhao;
    }

    public void setTentinhtrangphuckhao(String Tentinhtrangphuckhao) {
        this.Tentinhtrangphuckhao = Tentinhtrangphuckhao;
    }
    
}
