/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.repository.custom;

import edu.ijse.hibernate.entity.UserEntity;
import edu.ijse.hibernate.repository.CrudRepository;

/**
 *
 * @author pathum
 */
public interface UserRepository extends CrudRepository<UserEntity, String>{
    
}
