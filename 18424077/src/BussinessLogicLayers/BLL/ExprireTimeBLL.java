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
public class ExprireTimeBLL extends BaseBLL<ExpireTimeObjects>{

    @Override
    public List<ExpireTimeObjects> getElement() {
        return new ExprireTimeDAL().getElement();
    }
    
    public ExpireTimeObjects GetElementByID(int ID)
    {
        return new ExprireTimeDAL().GetElementByID(ID);
    }

    @Override
    public boolean Insert(ExpireTimeObjects OT) {
        return new ExprireTimeDAL().Insert(OT);
    }

    @Override
    public boolean Update(ExpireTimeObjects OT) {
        return new ExprireTimeDAL().Update(OT);
    }
    
}
