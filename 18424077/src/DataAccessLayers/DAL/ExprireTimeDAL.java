/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;
import ValueObjects.*;
import org.hibernate.Session;
import Util.*;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;
/**
 *
 * @author Nguy Minh Trong
 */
public class ExprireTimeDAL extends BaseDAL<ExpireTimeObjects>{

    @Override
    public List<ExpireTimeObjects> getElement() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ExpireTimeObjects> lst = null;
        try
        {
            String hql = "from ExpireTimeObjects";
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
    
    public ExpireTimeObjects GetElementByID(int ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ExpireTimeObjects exp = null;
        try
        {
            exp = (ExpireTimeObjects) session.get(ExpireTimeObjects.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return exp;
    }

    @Override
    public boolean Insert(ExpireTimeObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByID(OT.getID()) != null)
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

    @Override
    public boolean Update(ExpireTimeObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByID(OT.getID()) == null)
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
