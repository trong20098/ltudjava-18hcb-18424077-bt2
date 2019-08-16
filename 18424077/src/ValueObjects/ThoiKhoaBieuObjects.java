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
public class ThoiKhoaBieuObjects implements Serializable{
    private static final long serialVersionUID = 1L;
    private String MaMon;
    private String TenMon;
    private String Phonghoc;
    
    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getPhonghoc() {
        return Phonghoc;
    }

    public void setPhonghoc(String Phonghoc) {
        this.Phonghoc = Phonghoc;
    }
    
}
