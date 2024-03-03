/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.dto.RoomCategoryDto;
import edu.ijse.hibernate.entity.CustomerEntity;
import edu.ijse.hibernate.entity.RoomCategoryEntity;
import edu.ijse.hibernate.entity.RoomEntity;
import edu.ijse.hibernate.repository.RepositoryFactory;
import static edu.ijse.hibernate.repository.RepositoryFactory.repositoryType.ROOM_CATOGORIES;
import edu.ijse.hibernate.repository.custom.RoomCategoryRepository;
import edu.ijse.hibernate.repository.custom.RoomRepository;
import edu.ijse.hibernate.service.custom.RoomCategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pathum
 */
public class RoomCategoryServiceImple implements RoomCategoryService{
    
    private final RoomCategoryRepository roomCategoryRepository = (RoomCategoryRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.ROOM_CATOGORIES);

    @Override
    public String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(
                roomCategoryDto.getCategoryName(),
                roomCategoryDto.getBedCount(),
                roomCategoryDto.getUserCount()
//                ,new ArrayList<RoomEntity>()
        );
        
        if(roomCategoryRepository.save(entity)>0){
            return "Successfully Saved";
        }else{
            return "Failed";
        }
    }

    @Override
    public String updateRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(
                roomCategoryDto.getCategoryName(),
                roomCategoryDto.getBedCount(),
                roomCategoryDto.getUserCount()
//                ,new ArrayList<RoomEntity>()
        );
        roomCategoryRepository.update(entity);
        return "Updated Succesfully";
    }

    @Override
    public String deleteRoomCategory(String categoryName) throws Exception {
        roomCategoryRepository.delete(categoryName);
        return "Succesfully delete";
    }

    @Override
    public RoomCategoryDto getRoomCategory(String categoryName) throws Exception {
        RoomCategoryEntity e = roomCategoryRepository.get(categoryName);
        RoomCategoryDto dto = new RoomCategoryDto(
                    e.getCategoryName(),
                    e.getBedCount(),
                    e.getUserCount()
//                    ,new ArrayList<RoomEntity>()
        );
        return dto;
    }

    @Override
    public List<RoomCategoryDto> getAllRoomCategories() throws Exception {
        List<RoomCategoryDto> roomCategoryDtos = new ArrayList<>();
        List<RoomCategoryEntity> roomCategoryEntities = roomCategoryRepository.getAll();
        
        for (RoomCategoryEntity e : roomCategoryEntities) {
            roomCategoryDtos.add(new RoomCategoryDto(
                    e.getCategoryName(),
                    e.getBedCount(),
                    e.getUserCount()
//                    ,new ArrayList<RoomEntity>()
            ));
        }
        return roomCategoryDtos;
    }
    
}
