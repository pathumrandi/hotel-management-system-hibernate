/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository;

import edu.ijse.hibernate.repository.custom.imple.CheckInRepositoryImple;
import edu.ijse.hibernate.repository.custom.imple.CustomerRepositoryImple;
import edu.ijse.hibernate.repository.custom.imple.RoomCategoryRepositoryImple;
import edu.ijse.hibernate.repository.custom.imple.RoomRepositoryImple;
import edu.ijse.hibernate.repository.custom.imple.UserRepositoryImple;

/**
 *
 * @author pathum
 */
public class RepositoryFactory {
    private static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {
        
    }
    
    public static RepositoryFactory getInstance(){
        if(repositoryFactory == null){
            repositoryFactory = new RepositoryFactory();
        }
        
        return repositoryFactory;
    }
    
    public enum repositoryType{
        CUSTOMER, ROOM, ROOM_CATOGORIES,USER, CHECK_IN
    }
    
    public SuperRepository getRepository(repositoryType type){
        switch (type) {
            case CUSTOMER:
                return new CustomerRepositoryImple();
                
            case USER:
                return new UserRepositoryImple();
                
            case ROOM:
                return new RoomRepositoryImple();
                
            case ROOM_CATOGORIES:
                return new RoomCategoryRepositoryImple();
                
            case CHECK_IN:
                return new CheckInRepositoryImple();
                
            default:
                return null;
        }
    }
}
