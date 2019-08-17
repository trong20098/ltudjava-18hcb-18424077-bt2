/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;
import ValueObjects.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import org.hibernate.Session;
import Util.*;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Nguy Minh Trong
 */
public class StudyResultDAL extends BaseDAL<StudyResultObjects>{
    @SuppressWarnings("unchecked")
    public List<StudyResultObjects> GetElementByMaLopAndMaMon(String malop, String mamon)
    {
        List<StudyResultObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from StudyResultObjects where MaLop = :malop and MaMon = :mamon";
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
    
    public StudyResultObjects GetElementByMaLopAndMaMonAndStudentID(String malop, String mamon, String studentid)
    {
        StudyResultObjects sr = null;
        List<StudyResultObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from StudyResultObjects where MaLop = :malop and MaMon = :mamon and StudentID = :studentid";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
            query.setParameter("mamon", mamon);
            query.setParameter("studentid", studentid);
            lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                sr = lst.get(i);
            }
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally{
            session.close();
        }
        return sr;
    }

    @Override
    public boolean Insert(StudyResultObjects OT) {
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
    public boolean Update(StudyResultObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByMaLopAndMaMonAndStudentID(OT.getMaLop(), OT.getMaMon(), OT.getStudentID()) == null)
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
