/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import ValueObjects.*;
import java.util.List;
import DataAccessLayers.DAL.*;
import Util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Nguy Minh Trong
 */
public class ScheduledBLL extends BaseBLL<ScheduledObjects>{

    @Override
    public List<ScheduledObjects> getElement() {
        return new ScheduledDAL().getElement();
    }
    
    public List<ScheduledObjects> getElementByMaLop(String malop) {
        return new ScheduledDAL().getElementByMaLop(malop);
    }

    @Override
    public boolean Insert(ScheduledObjects OT) {
        return new ScheduledDAL().Insert(OT);
    }
    
}