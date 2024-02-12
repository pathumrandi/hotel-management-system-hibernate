/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.util;


import edu.ijse.hibernate.entity.CustomerEntity;
import edu.ijse.hibernate.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pathum
 */
public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    
    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(CustomerEntity.class)
                .addAnnotatedClass(UserEntity.class);
        
        sessionFactory = configuration.buildSessionFactory();
    }
    
    public static SessionFactoryConfiguration getInstance(){
        if(sessionFactoryConfiguration == null){
            sessionFactoryConfiguration = new SessionFactoryConfiguration();
        }

        return sessionFactoryConfiguration;
    }
    
    public Session getSession(){
        return sessionFactory.openSession();
    }
    
}
