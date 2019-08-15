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
public class ClassDAL extends BaseDAL<ClassObjects>{

    @Override
    public List<ClassObjects> getElement() {
        List<ClassObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ClassObjects";
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
    public ClassObjects GetElementByID(String ID) {
        ClassObjects cl = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            cl = (ClassObjects) session.get(ClassObjects.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return cl;
    }

    @Override
    public boolean Insert(ClassObjects OT) {
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
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
}
