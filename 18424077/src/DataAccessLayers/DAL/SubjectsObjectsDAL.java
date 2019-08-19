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
import org.hibernate.Transaction;
/**
 *
 * @author Nguy Minh Trong
 */
public class SubjectsObjectsDAL extends BaseDAL<SubjectsObjects>{

    @Override
    public List<SubjectsObjects> getElement() {
        List<SubjectsObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from SubjectsObjects";
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

    @Override
    public SubjectsObjects GetElementByID(String ID) {
        SubjectsObjects su = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            su = (SubjectsObjects) session.get(SubjectsObjects.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return su;
    }
    
    public SubjectsObjects GetElementByTenMon(String tenmon)
    {
        SubjectsObjects su = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from SubjectsObjects where TenMon = :tenmon";
            Query query = session.createQuery(hql);
            query.setParameter("tenmon", tenmon);
            List<SubjectsObjects> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                su = lst.get(i);
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
        return su;
    }

    @Override
    public boolean Insert(SubjectsObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByID(OT.getMaMon()) != null)
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
