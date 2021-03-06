/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gdse41.sem1project.controller.custom;

import edu.gdse41.sem1project.controller.SuperController;
import edu.gdse41.sem1project.dto.RoomDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hansani Kariyawasam
 */
public interface RoomController extends SuperController<RoomDTO>{
    public ArrayList<String> getAllRoomIDs()throws SQLException,ClassNotFoundException;
    
    public  ArrayList<RoomDTO> getRooms(String id)throws SQLException,ClassNotFoundException;
}
