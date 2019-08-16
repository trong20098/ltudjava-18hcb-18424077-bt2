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
public class ClassSubjectsDAL extends BaseDAL<ClassSubjectsObjects>{
    public List<ClassSubjectsObjects> GetElementByLopAndMonHoc(String malop, String mamon)
    {
        List<ClassSubjectsObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ClassSubjectsObjects where MaLop = :malop and MaMon = :mamon";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
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
    public List<ClassSubjectsObjects> getElement() {
        List<ClassSubjectsObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ClassSubjectsObjects";
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
    public ClassSubjectsObjects GetElementByID(String ID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ClassSubjectsObjects cs = null;
        try
        {
            cs = (ClassSubjectsObjects) session.get(ClassSubjectsObjects.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return cs;
    }

    @Override
    public boolean Insert(ClassSubjectsObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        if(GetElementByID(OT.getMaLop()) != null)
//        {
//            return false;
//        }
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
