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

/**
 *
 * @author Nguy Minh Trong
 */
public class UserDAL extends BaseDAL<UserObjects>{
    public static String dir = "src/DataAccessLayers/Database/user";
    @SuppressWarnings("unchecked")
    @Override
    public List<UserObjects> getElement(String filename) {
        List<UserObjects> lst = new ArrayList<>();
        FileInputStream fi = null;
        ObjectInputStream obfi = null;
        try
        {
            fi = new FileInputStream(new File(dir, filename));
            obfi = new ObjectInputStream(fi);
            lst = (List<UserObjects>)obfi.readObject();
        }
        catch(IOException | ClassNotFoundException ex)
        {
            ex.getMessage();
        }finally
        {
            closeStream(fi);
            closeStream(obfi);
        }
        return lst;
    }

    @Override
    public void Update(String filename, List<UserObjects> lst) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try
        {
            fos = new FileOutputStream(new File(dir, filename));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lst);
        }
        catch(IOException ex)
        {
            ex.getMessage();
        }finally{
            closeStream(fos);
            closeStream(oos);
        }
    }
    
    private void closeStream(InputStream is)
    {
        if(is != null)
        {
            try
            {
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
}
