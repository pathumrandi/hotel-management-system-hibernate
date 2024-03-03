/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.dto.RoomCategoryDto;
import edu.ijse.hibernate.dto.RoomDto;
import edu.ijse.hibernate.entity.RoomCategoryEntity;
import edu.ijse.hibernate.entity.RoomEntity;
import edu.ijse.hibernate.repository.RepositoryFactory;
import edu.ijse.hibernate.repository.custom.CustomerRepository;
import edu.ijse.hibernate.repository.custom.RoomRepository;
import edu.ijse.hibernate.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pathum
 */
public class RoomServiceImple implements RoomService{
    
    private final RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.ROOM);

    @Override
    public String saveRoom(RoomDto roomDto) throws Exception {
        RoomCategoryEntity category = new RoomCategoryEntity();
        RoomEntity entity = new RoomEntity(
                roomDto.getRoomNumber(),
                roomDto.getPrice(),
                roomDto.getStatus(),
                roomDto.getType(),
                roomDto.getBedCount()
//                ,roomDto.getCategory()
        );
        
        if(roomRepository.save(entity)>0){
            return "Successfully Saved";
        }else{
            return "Failed";
        }
    }

    @Override
    public String updateRoom(RoomDto roomDto) throws Exception {
        RoomCategoryEntity category = new RoomCategoryEntity();
        RoomEntity entity = new RoomEntity(
                roomDto.getRoomNumber(),
                roomDto.getPrice(),
                roomDto.getStatus(),
                roomDto.getType(),
                roomDto.getBedCount()
//                ,roomDto.getCategory()
        );
        roomRepository.update(entity);
        return "Updated Succesfully";
    }

    @Override
    public String deleteRoom(Integer roomNumber) throws Exception {
        roomRepository.delete(roomNumber);
        return "Succesfully delete";
    }

    @Override
    public RoomDto getRoom(Integer roomNumber) throws Exception {
        RoomEntity e = roomRepository.get(roomNumber);
        RoomDto dto = new RoomDto(
                    e.getRoomNumber(),
                    e.getPrice(),
                    e.getStatus(),
                e.getType(),
                e.getBedCount()
//        ,e.getCategory()
        );
        return dto;
    }

    @Override
    public List<RoomDto> getAllRooms() throws Exception {
        List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntities = roomRepository.getAll();
        
        for (RoomEntity e : roomEntities) {
            roomDtos.add(new RoomDto(
                    e.getRoomNumber(),
                    e.getPrice(),
                    e.getStatus(),
                    e.getType(),
                e.getBedCount()
//                    ,e.getCategory()
            ));
        }
        return roomDtos;
    }
    
}
