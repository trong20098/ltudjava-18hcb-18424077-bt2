/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;
import java.util.List;

/**
 *
 * @author Nguy Minh Trong
 * @param <T>
 */
public class BaseDAL<T> {
    public BaseDAL()
    {
        
    }
    @SuppressWarnings("unchecked")
    public List<T> getElement(String filename){return null;}
    
    public List<T> GetElementImportfileCSV(String filename){return null;}
    
    public T GetElementByID(String ID){return null;}
    
    public boolean Insert(T OT){return true;}
    
    public boolean Update(T OT){return true;}
    
    public boolean Delete(T OT){return true;}
}
