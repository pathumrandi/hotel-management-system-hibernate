/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service;

import edu.ijse.hibernate.service.custom.imple.CheckInServiceImple;
import edu.ijse.hibernate.service.custom.imple.CustomerServiceImple;
import edu.ijse.hibernate.service.custom.imple.RoomCategoryServiceImple;
import edu.ijse.hibernate.service.custom.imple.RoomServiceImple;
import edu.ijse.hibernate.service.custom.imple.SignUpServiceImple;

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
                return new RoomServiceImple();
            
            case CUSTOMER:
                return new CustomerServiceImple();
                
            case ROOM_CATEGORIES:
                return new RoomCategoryServiceImple();
                
            case USER:
                return new SignUpServiceImple();
                
            case CHECK_IN:
                return new CheckInServiceImple();
                
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ROOM, CUSTOMER, ROOM_CATEGORIES,USER,CHECK_IN
    }
}
