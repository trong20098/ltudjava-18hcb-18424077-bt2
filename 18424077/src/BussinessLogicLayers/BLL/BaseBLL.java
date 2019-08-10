/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogicLayers.BLL;

import java.util.List;

/**
 *
 * @author Nguy Minh Trong
 * @param <T>
 */
public class BaseBLL<T> {

    public List<T> getElement(String filename) {return null;}

    public List<T> GetElementImportfileCSV(String filename) {return null;}

    public void Insert(String filename, List<T> lst) {}
    
    public void Update(String filename, List<T> lst) {}
    
    public void Delete(String filename, List<T> lst) {}
}
