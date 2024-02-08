/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.repository;

import edu.ijse.hibernate.repository.custom.imple.CustomerRepositoryImple;

/**
 *
 * @author pathum
 */
public class RepositoryFactory {
    private RepositoryFactory repositoryFactory;

    private RepositoryFactory() {
        
    }
    
    public RepositoryFactory getInstance(){
        if(repositoryFactory != null){
            repositoryFactory = new RepositoryFactory();
        }
        
        return repositoryFactory;
    }
    
    public enum repositoryType{
        CUSTOMER, ROOM, ROOM_CATOGORIES
    }
    
    public SuperRepository getRepository(repositoryType type){
        switch (type) {
            case CUSTOMER:
                return new CustomerRepositoryImple();
            default:
                return null;
        }
    }
}
