/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18424077;

import Presentation.*;
import org.hibernate.Session;
import Util.*;
import java.util.List;
import org.hibernate.Query;
import ValueObjects.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from UserObjects";
            Query query = session.createQuery(hql);
            List<UserObjects> lst = query.list();
            for(UserObjects us : lst)
            {
                System.out.println(us.getUsername());
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        finally
        {
            session.close();
            System.exit(0);
        }
    }
    
}
