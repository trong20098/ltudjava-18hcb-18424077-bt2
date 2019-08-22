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
public class ReferencesPointObjects implements Serializable{
    private static final long serialVersionUID = 1L;
    private String StudentID;
    private String MaMon;
    private String CotDiemPhucKhao;
    private float DiemMongMuon;
    private String LiDo;
    
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getCotDiemPhucKhao() {
        return CotDiemPhucKhao;
    }

    public void setCotDiemPhucKhao(String CotDiemPhucKhao) {
        this.CotDiemPhucKhao = CotDiemPhucKhao;
    }

    public float getDiemMongMuon() {
        return DiemMongMuon;
    }

    public void setDiemMongMuon(float DiemMongMuon) {
        this.DiemMongMuon = DiemMongMuon;
    }

    public String getLiDo() {
        return LiDo;
    }

    public void setLiDo(String LiDo) {
        this.LiDo = LiDo;
    }
    
}
