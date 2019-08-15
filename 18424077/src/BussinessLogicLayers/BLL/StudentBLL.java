/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import DataAccessLayers.DAL.*;
import java.util.List;
import ValueObjects.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class StudentBLL extends BaseBLL<StudentObjects>{
    @Override
    public List<StudentObjects> getElement() {
        return new StudentDAL().getElement();
    }

    @Override
    public List<StudentObjects> GetElementImportfileCSV(String filename) {
        return new StudentDAL().GetElementImportfileCSV(filename);
    }

    public List<StudentObjects> getElementByMaLop(String malop) {
        return new StudentDAL().getElementByMaLop(malop);
    }

    @Override
    public StudentObjects GetElementByID(String ID) {
        return new StudentDAL().GetElementByID(ID);
    }

    @Override
    public boolean Insert(StudentObjects OT) {
        return new StudentDAL().Insert(OT);
    }
    
}
