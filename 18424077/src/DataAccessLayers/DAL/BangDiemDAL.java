/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayers.DAL;

import ValueObjects.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguy Minh Trong
 */
public class BangDiemDAL extends BaseDAL<BangDiem>{
    @Override
    public List<BangDiem> GetElementImportfileCSV(String filename) {
        List<BangDiem> lst = new ArrayList<>();
        FileInputStream fi = null;
        ObjectInputStream obfi = null;
        try
        {
            fi = new FileInputStream(new File(filename));
            obfi = new ObjectInputStream(fi);
            lst = (List<BangDiem>)obfi.readObject();
        }
        catch(IOException | ClassNotFoundException ex)
        {
            ex.getMessage();
        }
        finally{
            closeStream(fi);
            closeStream(obfi);
        }
        return lst;
    }
    
    private void closeStream(InputStream is)
    {
        if(is != null)
        {
            try{
                is.close();
            }
            catch(IOException ex)
            {
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
