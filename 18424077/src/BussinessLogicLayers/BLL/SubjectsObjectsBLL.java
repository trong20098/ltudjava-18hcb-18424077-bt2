/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import ValueObjects.*;
import java.util.List;
import DataAccessLayers.DAL.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class SubjectsObjectsBLL extends BaseBLL<SubjectsObjects>{

    @Override
    public List<SubjectsObjects> getElement() {
        return new SubjectsObjectsDAL().getElement();
    }

    @Override
    public SubjectsObjects GetElementByID(String ID) {
        return new SubjectsObjectsDAL().GetElementByID(ID);
    }

    @Override
    public boolean Insert(SubjectsObjects OT) {
        return new SubjectsObjectsDAL().Insert(OT);
    }
    
}
