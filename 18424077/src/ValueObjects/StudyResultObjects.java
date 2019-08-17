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
public class StudyResultObjects implements Serializable{
    private static final long serialVersionUID = 1L;
    private String MaLop;
    private String MaMon;
    private String StudentID;
    private float DiemGK;
    private float DiemCK;
    private float DiemKhac;
    private float DiemTong;
    
    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
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
