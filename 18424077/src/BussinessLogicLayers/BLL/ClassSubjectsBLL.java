/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import ValueObjects.*;
import java.util.*;
import DataAccessLayers.DAL.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class ClassSubjectsBLL extends BaseBLL<ClassSubjectsObjects>{
    public List<ClassSubjectsObjects> GetElementByLopAndMonHoc(String malop, String mamon)
    {
        return new ClassSubjectsDAL().GetElementByLopAndMonHoc(malop, mamon);
    }

    @Override
    public List<ClassSubjectsObjects> getElement() {
        return new ClassSubjectsDAL().getElement();
    }

    @Override
    public boolean Insert(ClassSubjectsObjects OT) {
        return new ClassSubjectsDAL().Insert(OT);
    }
    
}
