/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;
import ValueObjects.*;
import java.util.List;
import DataAccessLayers.DAL.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class StatusReferencesPointBLL extends BaseBLL<StatusReferencesPoint>{

    @Override
    public List<StatusReferencesPoint> getElement() {
        return new StatusReferencesPointDAL().getElement();
    }
    
}
