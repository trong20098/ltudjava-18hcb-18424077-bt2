/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import DataAccessLayers.DAL.*;
import  ValueObjects.*;
import java.util.List;
/**
 *
 * @author Nguy Minh Trong
 */
public class ClassBLL extends BaseBLL<ClassObjects>{

    @Override
    public List<ClassObjects> getElement() {
        return new ClassDAL().getElement();
    }

    @Override
    public boolean Insert(ClassObjects OT) {
        return new ClassDAL().Insert(OT);
    }
    
    
}
