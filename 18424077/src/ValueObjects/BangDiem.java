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
public class BangDiem implements Serializable{
    private static final long serialVersionUID = 1L;
    private String StudenID;
    private String Fullname;
    private float DiemGK;
    private float DiemCK;
    private float DiemKhac;
    private float DiemTong;
    
    public String getStudenID() {
        return StudenID;
    }

    public void setStudenID(String StudenID) {
        this.StudenID = StudenID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public float getDiemGK() {
        return DiemGK;
    }

    public void setDiemGK(float DiemGK) {
        this.DiemGK = DiemGK;
    }

    public float getDiemCK() {
        return DiemCK;
    }

    public void setDiemCK(float DiemCK) {
        this.DiemCK = DiemCK;
    }

    public float getDiemKhac() {
        return DiemKhac;
    }

    public void setDiemKhac(float DiemKhac) {
        this.DiemKhac = DiemKhac;
    }

    public float getDiemTong() {
        return DiemTong;
    }

    public void setDiemTong(float DiemTong) {
        this.DiemTong = DiemTong;
    }
    
}
