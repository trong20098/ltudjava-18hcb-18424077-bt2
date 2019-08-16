/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import DataAccessLayers.DAL.ThoiKhoaBieuDAL;
import ValueObjects.*;
import java.util.List;

/**
 *
 * @author Nguy Minh Trong
 */
public class ThoiKhoaBieuBLL extends BaseBLL<ThoiKhoaBieuObjects>{
    
    @Override
    public List<ThoiKhoaBieuObjects> GetElementImportfileCSV(String filename) {
        return new ThoiKhoaBieuDAL().GetElementImportfileCSV(filename);
    }
    
}
