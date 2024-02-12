/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.service.custom;


import edu.ijse.hibernate.dto.UserDto;
import edu.ijse.hibernate.service.SuperService;
import java.util.List;

/**
 *
 * @author pathum
 */
public interface SignUpService extends SuperService{
    String saveUser(UserDto userDto) throws Exception;
    String updateUser(UserDto userDto) throws Exception;
    String deleteUser(String userId) throws Exception;
    UserDto getUser(String userId) throws Exception;
    List<UserDto> getAllUsers() throws Exception;
}
