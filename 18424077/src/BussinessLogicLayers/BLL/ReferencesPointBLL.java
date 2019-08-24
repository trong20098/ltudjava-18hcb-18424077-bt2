/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import DataAccessLayers.DAL.*;
import ValueObjects.*;
import java.util.List;
/**
 *
 * @author Nguy Minh Trong
 */
public class ReferencesPointBLL extends BaseBLL<ReferencesPointObjects>{

    @Override
    public List<ReferencesPointObjects> getElement() {
        return new ReferencesPointDAL().getElement();
    }
    
    public ReferencesPointObjects GetElementByStudentIDandMaMon(String Studentid, String malop, String mamon)
    {
        return new ReferencesPointDAL().GetElementByStudentIDandMaMon(Studentid, malop, mamon);
    }

    @Override
    public boolean Insert(ReferencesPointObjects OT) {
        return new ReferencesPointDAL().Insert(OT);
    }

    @Override
    public boolean Update(ReferencesPointObjects OT) {
        return new ReferencesPointDAL().Update(OT);
    }
    
}
