/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.dto.RoomDto;
import edu.ijse.hibernate.repository.RepositoryFactory;
import edu.ijse.hibernate.repository.custom.CustomerRepository;
import edu.ijse.hibernate.repository.custom.RoomRepository;
import edu.ijse.hibernate.service.custom.RoomService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class RoomServiceImple implements RoomService{
    
    private final RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.ROOM);

    @Override
    public String saveRoom(RoomDto roomDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateRoom(RoomDto roomDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteRoom(Integer roomNumber) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CustomerDto getRoom(Integer roomNumber) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<RoomDto> getAllRooms() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
