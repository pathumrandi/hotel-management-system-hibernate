/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository.custom.imple;

import edu.ijse.hibernate.entity.RoomEntity;
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
public class RoomRepositoryImple implements RoomRepository{
    private final Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer save(RoomEntity t) throws Exception {
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(t);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e);
            return -1;
        }
    }

    @Override
    public void update(RoomEntity t) throws Exception {
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(t);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at update " + t.getRoomNumber());
        }
    }

    @Override
    public void delete(Integer id) throws Exception {
        Transaction transaction = session.beginTransaction();
        RoomEntity roomEntity = get(id);
        try {
            session.delete(roomEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at delete " + roomEntity.getRoomNumber());
        }
    }

    @Override
    public RoomEntity get(Integer id) throws Exception {
        RoomEntity roomEntity = session.get(RoomEntity.class, id);
        return roomEntity;
    }

    @Override
    public List<RoomEntity> getAll() throws Exception {
        List<RoomEntity> entities;
        String hql = "FROM RoomEntity";
        Query query = session.createQuery(hql);
        entities = query.list();
        System.out.println("Size: "+entities.size());
        return entities;
    }
}
