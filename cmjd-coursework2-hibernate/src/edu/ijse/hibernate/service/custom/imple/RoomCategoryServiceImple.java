/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.dto.RoomCategoryDto;
import edu.ijse.hibernate.repository.RepositoryFactory;
import static edu.ijse.hibernate.repository.RepositoryFactory.repositoryType.ROOM_CATOGORIES;
import edu.ijse.hibernate.repository.custom.RoomCategoryRepository;
import edu.ijse.hibernate.repository.custom.RoomRepository;
import edu.ijse.hibernate.service.custom.RoomCategoryService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class RoomCategoryServiceImple implements RoomCategoryService{
    
    private final RoomCategoryRepository roomCategoryRepository = (RoomCategoryRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.ROOM_CATOGORIES);

    @Override
    public String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteRoomCategory(String categoryName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CustomerDto getRoomCategory(String categoryName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CustomerDto> getAllRoomCategories() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
