/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;
import ValueObjects.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import Util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nguy Minh Trong
 */
public class StudentDAL extends BaseDAL<StudentObjects>{

    private final String dir = "src/DataAccessLayers/Database/SinhVien";

    @Override
    public List<StudentObjects> getElement() {
        List<StudentObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from StudentObjects";
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
    
    public List<StudentObjects> getElementByMaLop(String malop) {
        List<StudentObjects> lst = null;
        if(malop == null)
        {
            return lst;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from StudentObjects where ClassName = :malop";
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
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<StudentObjects> GetElementImportfileCSV(String filename) {
        List<StudentObjects> lst = new ArrayList<>();
        FileInputStream fi = null;
        ObjectInputStream obfi = null;
        try
        {
            fi = new FileInputStream(new File(filename));
            obfi = new ObjectInputStream(fi);
            lst = (List<StudentObjects>)obfi.readObject();
        }
        catch(IOException | ClassNotFoundException ex)
        {
            ex.getMessage();
        }
        finally
        {
            closeStream(fi);
            closeStream(obfi);
        }
        return lst;
    }

    @SuppressWarnings("unchecked")
    private void closeStream(InputStream is)
    {
        if(is != null)
        {
            try{
                is.close();
            }
            catch(IOException ex)
            {
                ex.getMessage();
            }
        }
    }
    
    private void closeStream(OutputStream os)
    {
        if(os != null)
        {
            try
            {
                os.close();
            }
            catch(IOException ex)
            {
                ex.getMessage();
            }
        }
    }

    @Override
    public StudentObjects GetElementByID(String ID) {
        StudentObjects st = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            st = (StudentObjects) session.get(StudentObjects.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return st;
    }

    @Override
    public boolean Insert(StudentObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByID(OT.getMSSV()) != null)
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
        finally{
            session.close();
        }
        return true;
    }
}
