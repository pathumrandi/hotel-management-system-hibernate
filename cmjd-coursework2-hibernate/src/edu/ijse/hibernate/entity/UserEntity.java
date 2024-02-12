/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author pathum
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @Column(name="userName")
    private String userName;
    
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    
    @Column(name = "password", length = 50, nullable = false)
    private String password;
    
    @Column(name = "securityQuestion", length = 50, nullable = false)
    private String securityQuestion;
    
    @Column(name = "answer", length = 50, nullable = false)
    private String answer;
    
    @Column(name = "status", length = 50, nullable = false)
    private String status;
}
