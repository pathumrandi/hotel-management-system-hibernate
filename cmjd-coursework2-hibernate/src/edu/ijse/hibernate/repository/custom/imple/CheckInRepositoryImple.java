/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository.custom.imple;

import edu.ijse.hibernate.controller.RoomController;
import edu.ijse.hibernate.dto.CheckInDetailDto;
import edu.ijse.hibernate.dto.RoomDto;
import edu.ijse.hibernate.entity.CheckInEntity;
import edu.ijse.hibernate.entity.RoomEntity;
import edu.ijse.hibernate.repository.custom.CheckInRepository;
import edu.ijse.hibernate.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author pathum
 */
public class CheckInRepositoryImple implements CheckInRepository {

    private final Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer save(CheckInEntity t) throws Exception {
        RoomController roomController = new RoomController();
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(t);
            for(CheckInDetailDto dto:t.getDtos()){
                Integer roomNumber = dto.getRoomNumber();
                RoomDto roomDto = roomController.getRoom(roomNumber);
                roomDto.setStatus("Not Available");
                String resp = roomController.updateRoomCategories(roomDto);
            }
            
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e);
            return -1;
        }
    }

    @Override
    public void update(CheckInEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) throws Exception {
        Transaction transaction = session.beginTransaction();
        CheckInEntity entity = get(id);
        try {
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at delete " + entity.getCustId());
        }
    }

    @Override
    public CheckInEntity get(Integer id) throws Exception {
        CheckInEntity e = session.get(CheckInEntity.class, id);
        return e;
    }

    @Override
    public List<CheckInEntity> getAll() throws Exception {
        List<CheckInEntity> entities;
        String hql = "FROM CheckInEntity";
        Query query = session.createQuery(hql);
        entities = query.list();
        System.out.println("Size: "+entities.size());
        return entities;
    }

}
