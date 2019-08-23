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
/**
 *
 * @author Nguy Minh Trong
 */
public class StatusReferencesPointDAL extends BaseDAL<StatusReferencesPoint>{

    @Override
    public List<StatusReferencesPoint> getElement() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<StatusReferencesPoint> lst = null;
        try
        {
            String hql = "from StatusReferencesPoint";
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
    
}
