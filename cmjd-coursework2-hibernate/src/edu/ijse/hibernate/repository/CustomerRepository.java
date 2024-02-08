/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository;

import edu.ijse.hibernate.entity.CustomerEntity;
import edu.ijse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pathum
 */
public class CustomerRepository {
    private Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveCustomer(CustomerEntity entity){
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(entity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }
    
    public CustomerEntity getCustomer(Integer id){
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }
    
    public void updateStudent(CustomerEntity customerEntity) throws RuntimeException{
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at update " + customerEntity.getCustId());
        }
    }
    
    public void deleteStudent(CustomerEntity customerEntity) throws RuntimeException{
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at delete " + customerEntity.getCustId());
        }
    }
}
