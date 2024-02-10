/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service;

import edu.ijse.hibernate.service.custom.imple.CustomerServiceImple;

/**
 *
 * @author pathum
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){
        
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case ROOM:
                return null;
            
            case CUSTOMER:
                return new CustomerServiceImple();
                
            case ROOM_CATEGORIES:
                return null;
                
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ROOM, CUSTOMER, ROOM_CATEGORIES
    }
}
