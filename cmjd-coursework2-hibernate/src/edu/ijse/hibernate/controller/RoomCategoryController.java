/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.dto.RoomCategoryDto;
import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.RoomCategoryService;
import edu.ijse.hibernate.service.custom.RoomService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class RoomCategoryController {
    private final RoomCategoryService ROOM_CATEGORY_SERVICE = (RoomCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM_CATEGORIES);

    public List<RoomCategoryDto> getAll() throws Exception{
        return ROOM_CATEGORY_SERVICE.getAllRoomCategories();
    }

    public String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        return ROOM_CATEGORY_SERVICE.saveRoomCategory(roomCategoryDto);
    }

    public RoomCategoryDto getRoomCategory(String categoryName) throws Exception {
        return ROOM_CATEGORY_SERVICE.getRoomCategory(categoryName);
    }

    public String updateRoomCategories(RoomCategoryDto roomCategoryDto) throws Exception {
        return ROOM_CATEGORY_SERVICE.updateRoomCategory(roomCategoryDto);
    }

    public String deleteRoomCategory(String categoryName) throws Exception {
        return ROOM_CATEGORY_SERVICE.deleteRoomCategory(categoryName);
    }

    
}
