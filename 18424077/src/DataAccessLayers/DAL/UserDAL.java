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
public class UserDAL extends BaseDAL<UserObjects>{
    
    public List<UserObjects> CheckLogin(String username, String password)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<UserObjects> lst = new ArrayList<>();
        try
        {
            session.beginTransaction();
            String hql = "select Username, Password from UserObjects where Username = :username and Password = :password";
            Query query = session.createQuery(hql);
            query.setParameter(":username", username);
            query.setParameter(":password", password);
            lst = query.list();
        }
        catch(Exception ex)
        {
            if(session.getTransaction() != null)
            {
                session.getTransaction().rollback();
            }
        }
        finally
        {
            session.close();
        }
        return lst;
    }
    
    public UserObjects GetElementByusername(String username)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        UserObjects us = new UserObjects();
        try
        {
            session.beginTransaction();
            String hql = "from UserObjects where Username = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            List<UserObjects> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                us.setAccountID(lst.get(i).getAccountID());
                us.setUsername(lst.get(i).getUsername());
                us.setPassword(lst.get(i).getPassword());
                us.setStudentID(lst.get(i).getStudentID());
            }
            
        }
        catch(Exception ex)
        {
            if(session.getTransaction() != null)
            {
                session.getTransaction().rollback();
            }
        }
        finally
        {
            session.close();
        }
        return us;
    }

    @Override
    public boolean Update(UserObjects OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(GetElementByusername(OT.getUsername()) == null)
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
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
}
