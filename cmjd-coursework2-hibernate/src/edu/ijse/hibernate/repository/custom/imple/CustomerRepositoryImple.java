/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository.custom.imple;

import edu.ijse.hibernate.entity.CustomerEntity;
import edu.ijse.hibernate.repository.custom.CustomerRepository;
import edu.ijse.hibernate.util.SessionFactoryConfiguration;
//import java.util.ArrayList;
import java.util.List;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author pathum
 */
public class CustomerRepositoryImple implements CustomerRepository {

    private final Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer save(CustomerEntity t) throws Exception {
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(t);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    @Override
    public void update(CustomerEntity t) throws Exception {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at update " + t.getCustId());
        }
    }

    @Override
    public void delete(String id) throws Exception {
        Transaction transaction = session.beginTransaction();
        CustomerEntity customerEntity = get(id);
        try {
            session.delete(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at delete " + customerEntity.getCustId());
        }
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        List<CustomerEntity> entities;
        String hql = "FROM customer";
        Query query = session.createQuery(hql);
        entities = query.list();
        return entities;
    }

}
