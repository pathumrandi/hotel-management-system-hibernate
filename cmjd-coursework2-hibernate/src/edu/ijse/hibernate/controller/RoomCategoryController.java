/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.RoomCategoryService;
import edu.ijse.hibernate.service.custom.RoomService;

/**
 *
 * @author pathum
 */
public class RoomCategoryController {
    private final RoomCategoryService ROOM_CATEGORY_SERVICE = (RoomCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM_CATEGORIES);
    
}
