/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.dto.RoomDto;
import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.RoomService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class RoomController {
    private final RoomService ROOM_SERVICE = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

    public List<RoomDto> getAll() throws Exception {
        return ROOM_SERVICE.getAllRooms();
    }

    public String saveRoom(RoomDto roomDto) throws Exception {
        return ROOM_SERVICE.saveRoom(roomDto);
    }

    public RoomDto getRoom(int roomNumber) throws Exception{
        return ROOM_SERVICE.getRoom(roomNumber);
    }

    public String deleteRoom(Integer roomNumber) throws Exception {
        return ROOM_SERVICE.deleteRoom(roomNumber);
    }

    public String updateRoomCategories(RoomDto roomDto) throws Exception {
        return ROOM_SERVICE.updateRoom(roomDto);
    }
    
}
