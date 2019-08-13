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
    public List<StudentObjects> getElement(String filename) {
        return new StudentDAL().getElement(filename);
    }

    @Override
    public List<StudentObjects> GetElementImportfileCSV(String filename) {
        return new StudentDAL().GetElementImportfileCSV(filename);
    }

}
