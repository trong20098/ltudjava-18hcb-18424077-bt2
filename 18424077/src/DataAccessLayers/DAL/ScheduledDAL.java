/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;
import ValueObjects.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import Util.*;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Nguy Minh Trong
 */
public class ScheduledDAL extends BaseDAL<ScheduledObjects>{
    @Override
    public List<ScheduledObjects> getElement() {
        List<ScheduledObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ScheduledObjects";
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
    
    public List<ScheduledObjects> getElementByMaLop(String malop) {
        List<ScheduledObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ScheduledObjects where MaLop = :malop";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
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
    
    public List<ScheduledObjects> getElementByMaMon(String mamon)
    {
        List<ScheduledObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ScheduledObjects where MaMon = :mamon";
            Query query = session.createQuery(hql);
            query.setParameter("mamon", mamon);
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

    @Override
    public ScheduledObjects GetElementByID(String ID) {
        ScheduledObjects sc = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            sc = (ScheduledObjects) session.get(ScheduledObjects.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return sc;
    }

    @Override
    public boolean Insert(ScheduledObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByID(OT.getMaLop()) != null)
        {
            return false;
        }
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(OT);
            transaction.commit();
        }
        catch(Exception ex)
        {
            transaction.rollback();
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
}
