/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository.custom.imple;

import edu.ijse.hibernate.entity.RoomCategoryEntity;
import edu.ijse.hibernate.entity.RoomEntity;
import edu.ijse.hibernate.repository.custom.RoomCategoryRepository;
import edu.ijse.hibernate.repository.custom.RoomRepository;
import edu.ijse.hibernate.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author pathum
 */
public class RoomCategoryRepositoryImple implements RoomCategoryRepository{
    private final Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer save(RoomCategoryEntity t) throws Exception {
        Transaction transaction = session.beginTransaction();
        try {
            String name = session.save(t).toString();
            transaction.commit();
            return 1;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    @Override
    public void update(RoomCategoryEntity t) throws RuntimeException {
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(t);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e);
            throw new RuntimeException("Error at update " + t.getCategoryName());
            
        }
    }

    @Override
    public void delete(String id) throws Exception {
        Transaction transaction = session.beginTransaction();
        RoomCategoryEntity roomCategoryEntity = get(id);
        try {
            session.delete(roomCategoryEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at delete " + roomCategoryEntity.getCategoryName());
        }
    }

    @Override
    public RoomCategoryEntity get(String id) throws Exception {
        RoomCategoryEntity roomCategoryEntity = session.get(RoomCategoryEntity.class, id);
        return roomCategoryEntity;
    }

    @Override
    public List<RoomCategoryEntity> getAll() throws Exception {
        List<RoomCategoryEntity> entities;
        String hql = "FROM RoomCategoryEntity";
        Query query = session.createQuery(hql);
        entities = query.list();
        System.out.println("Size: "+entities.size());
        return entities;
    }
    
}
