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
public class ReferencesPointDAL extends BaseDAL<ReferencesPointObjects>{

    @Override
    public List<ReferencesPointObjects> getElement() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ReferencesPointObjects> lst = null;
        try
        {
            String hql = "from ReferencesPointObjects";
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
    
    public ReferencesPointObjects GetElementByStudentIDandMaMon(String Studentid, String mamon)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ReferencesPointObjects rp = null;
        try
        {
            String hql = "from ReferencesPointObjects where StudentID = :Studentid and MaMon = :mamon";
            Query query = session.createQuery(hql);
            query.setParameter("Studentid", Studentid);
            query.setParameter("mamon", mamon);
            List<ReferencesPointObjects> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                rp = lst.get(i);
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
        return rp;
    }

    @Override
    public boolean Insert(ReferencesPointObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByStudentIDandMaMon(OT.getStudentID(), OT.getMaMon()) != null)
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
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }

    @Override
    public boolean Update(ReferencesPointObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByStudentIDandMaMon(OT.getStudentID(), OT.getMaMon()) == null)
        {
            return false;
        }
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.update(OT);
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
