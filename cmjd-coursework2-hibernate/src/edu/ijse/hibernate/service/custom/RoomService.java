/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.service.custom;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.dto.RoomDto;
import edu.ijse.hibernate.service.SuperService;
import java.util.List;

/**
 *
 * @author pathum
 */
public interface RoomService extends SuperService{
    String saveRoom(RoomDto roomDto) throws Exception;
    String updateRoom(RoomDto roomDto) throws Exception;
    String deleteRoom(Integer roomNumber) throws Exception;
    CustomerDto getRoom(Integer roomNumber) throws Exception;
    List<RoomDto> getAllRooms() throws Exception;
}
