/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="rooms")
public class RoomEntity {
    @Id
    @Column(name="roomNumber")
    private Integer roomNumber;
    
    @Column(name="price")
    private Integer price;
    
    @Column(name="status")
    private String status;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="room_category",nullable = false)
    private RoomCategoryEntity category;
}
