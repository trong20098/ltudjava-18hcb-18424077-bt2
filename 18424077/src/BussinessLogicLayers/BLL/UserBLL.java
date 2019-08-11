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
public class UserBLL extends BaseBLL<UserObjects>{
    public List<UserObjects> CheckLogin(String username, String password)
    {
        return new UserDAL().CheckLogin(username, password);
    }
    
    public UserObjects GetElementByusername(String username)
    {
        return new UserDAL().GetElementByusername(username);
    }

    @Override
    public boolean Update(UserObjects OT) {
        return new UserDAL().Update(OT);
    }
    
    
}
