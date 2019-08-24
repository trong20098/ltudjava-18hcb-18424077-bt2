/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;
import ValueObjects.*;
import java.util.List;
import org.hibernate.Session;
import Util.*;
import org.hibernate.Query;
/**
 *
 * @author Nguy Minh Trong
 */
public class StatusReferencesPointDAL extends BaseDAL<StatusReferencesPoint>{

    @Override
    public List<StatusReferencesPoint> getElement() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<StatusReferencesPoint> lst = null;
        try
        {
            String hql = "from StatusReferencesPoint";
            Query query = session.createQuery(hql);
            lst = query.list();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return lst;
    }

    public StatusReferencesPoint getElementByID(int ID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        StatusReferencesPoint sta = null;
        try
        {
            sta = (StatusReferencesPoint)session.get(StatusReferencesPoint.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return sta;
    }
    
    public StatusReferencesPoint GetElementByTinhTrang(String tinhtrang)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        StatusReferencesPoint sta = null;
        try
        {
            String hql = "from StatusReferencesPoint where Tentinhtrangphuckhao = :tinhtrang";
            Query query = session.createQuery(hql);
            query.setParameter("tinhtrang", tinhtrang);
            List<StatusReferencesPoint> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                sta = lst.get(i);
            }
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return sta;
    }
}
