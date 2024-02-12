/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.service.custom;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.dto.RoomCategoryDto;
import edu.ijse.hibernate.service.SuperService;
import java.util.List;

/**
 *
 * @author pathum
 */
public interface RoomCategoryService extends SuperService{
    String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception;
    String updateRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception;
    String deleteRoomCategory(String categoryName) throws Exception;
    CustomerDto getRoomCategory(String categoryName) throws Exception;
    List<CustomerDto> getAllRoomCategories() throws Exception;
}
