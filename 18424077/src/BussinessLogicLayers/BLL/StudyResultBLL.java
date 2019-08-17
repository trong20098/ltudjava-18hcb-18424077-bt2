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
public class StudyResultBLL extends BaseBLL<StudyResultObjects>{
    public List<StudyResultObjects> GetElementByMaLopAndMaMon(String malop, String mamon)
    {
        return new StudyResultDAL().GetElementByMaLopAndMaMon(malop, mamon);
    }
    
    public StudyResultObjects GetElementByMaLopAndMaMonAndStudentID(String malop, String mamon, String studentid)
    {
        return new StudyResultDAL().GetElementByMaLopAndMaMonAndStudentID(malop, mamon, studentid);
    }

    @Override
    public boolean Insert(StudyResultObjects OT) {
        return new StudyResultDAL().Insert(OT);
    }
    
}
