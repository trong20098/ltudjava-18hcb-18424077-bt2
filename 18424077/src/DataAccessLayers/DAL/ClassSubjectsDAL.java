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
            String hql = "from ClassSubjectsObjects where MaLop = :malop and MaMon = :mamon and Status < 2";
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
    
    public List<ClassSubjectsObjects> GetElementByMonHoc(String mamon)
    {
        List<ClassSubjectsObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ClassSubjectsObjects where MaMon = :mamon and Status < 2";
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
    public List<ClassSubjectsObjects> getElement() {
        List<ClassSubjectsObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ClassSubjectsObjects where Status < 2";
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
    
    public ClassSubjectsObjects GetElementByMaLopAndMaMonAndStudentID(String malop, String mamon, String studentID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ClassSubjectsObjects cs = null;
        try {
            String hql = "from ClassSubjectsObjects where MaLop = :malop and MaMon = :mamon and StudentID = :studentID and Status < 2";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
            query.setParameter("mamon", mamon);
            query.setParameter("studentID", studentID);
            List<ClassSubjectsObjects> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                cs = lst.get(i);
            }
        } catch (Exception e) {
            e.getMessage();
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
        if(GetElementByMaLopAndMaMonAndStudentID(OT.getMaLop(), OT.getMaMon(), OT.getStudentID()) != null)
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
    public boolean Update(ClassSubjectsObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByMaLopAndMaMonAndStudentID(OT.getMaLop(), OT.getMaMon(), OT.getStudentID()) == null)
        {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(OT);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }

    public boolean Delete(String malop, String mamon, String studentid) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ClassSubjectsObjects cs = GetElementByMaLopAndMaMonAndStudentID(malop, mamon, studentid);
        if(cs == null)
        {
            return false;
        }
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.delete(cs);
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
