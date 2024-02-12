/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.UserDto;
import edu.ijse.hibernate.entity.UserEntity;
import edu.ijse.hibernate.repository.RepositoryFactory;
import edu.ijse.hibernate.repository.custom.UserRepository;
import edu.ijse.hibernate.service.custom.SignUpService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class SignUpServiceImple implements SignUpService{
    
    private final UserRepository userRepository = (UserRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.USER);

    @Override
    public String saveUser(UserDto userDto) throws Exception {
        UserEntity entity = new UserEntity(
                userDto.getUserName(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getPassword(),
                userDto.getSecurityQuestion(),
                userDto.getAnswer(),
                "false");
        
        if(userRepository.save(entity)>0){
            return "Successfully Saved";
        }else{
            return "Failed";
        }
    }

    @Override
    public String updateUser(UserDto userDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteUser(String userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDto getUser(String userId) throws Exception {
        UserEntity e = userRepository.get(userId);
        return new UserDto(e.getUserName(), e.getName(), e.getEmail(), e.getPassword(), e.getSecurityQuestion(), e.getAnswer());
    }

    @Override
    public List<UserDto> getAllUsers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
