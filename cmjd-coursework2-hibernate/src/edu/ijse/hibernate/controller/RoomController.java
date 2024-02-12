/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.RoomService;

/**
 *
 * @author pathum
 */
public class RoomController {
    private final RoomService ROOM_SERVICE = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);
    
}
