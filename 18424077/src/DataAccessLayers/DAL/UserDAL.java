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
}
