/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.dto.UserDto;
import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.SignUpService;

/**
 *
 * @author pathum
 */
public class SignUpController {
    
    private SignUpService signupService = (SignUpService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String insertUser(UserDto dto) throws Exception {
        return signupService.saveUser(dto);
    }
    
}
