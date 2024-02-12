/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="roomCategories")
public class RoomCategoryEntity {
    @Id
    @Column(name="categoryName")
    private String categoryName;
    
    @Column(name="bedCount")
    private Integer bedCount;
    
    @Column(name="userCount")
    private Integer userCount;
    
    @OneToMany(mappedBy = "category",targetEntity = RoomEntity.class)
    private List<RoomEntity> roomEntities;
}
