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
public class StudentObjects implements Serializable{
    private static final long serialVersionUID = 1L;
    private String MSSV, Hoten, CMND, Gioitinh, ClassName;
    private int STT;
    
    public int getSTT()
    {
        return STT;
    }
    
    public int setSTT(int STT)
    {
        return STT;
    }
    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }
    
    public String getGioitinh() {
        return Gioitinh;
    }
    
    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
    
    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }
}
