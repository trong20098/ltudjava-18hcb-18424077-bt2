/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import DataAccessLayers.DAL.*;
import ValueObjects.*;
import java.util.List;

/**
 *
 * @author Nguy Minh Trong
 */
public class BangDiemBLL extends BaseBLL<BangDiem>{
    @Override
    public List<BangDiem> GetElementImportfileCSV(String filename) {
        return new BangDiemDAL().GetElementImportfileCSV(filename);
    }
    
}
