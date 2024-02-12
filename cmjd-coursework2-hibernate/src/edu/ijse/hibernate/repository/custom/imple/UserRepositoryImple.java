/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository.custom.imple;

import edu.ijse.hibernate.entity.UserEntity;
import edu.ijse.hibernate.repository.custom.UserRepository;
import edu.ijse.hibernate.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author pathum
 */
public class UserRepositoryImple implements UserRepository{
    private final Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer save(UserEntity t) throws Exception {
        Transaction transaction = session.beginTransaction();
        try {
            String id = (String) session.save(t);
            transaction.commit();
            return 1;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    @Override
    public void update(UserEntity t) throws Exception {                       
        Transaction transaction = session.beginTransaction();
        session.merge(t);
        try {
            session.update(t);
            System.out.println("Success");
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
            transaction.rollback();
            //throw new RuntimeException("Error at update " + t.getUserName());
        }
            
    }

    @Override
    public void delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserEntity get(String id) throws Exception {
        UserEntity e = session.get(UserEntity.class, id);
        return e;
    }

    @Override
    public List<UserEntity> getAll() throws Exception {
        List<UserEntity> entities;
        String hql = "FROM UserEntity";
        Query query = session.createQuery(hql);
        entities = query.list();
        System.out.println("Size: "+entities.size());
        return entities;
    }
    
    
}
