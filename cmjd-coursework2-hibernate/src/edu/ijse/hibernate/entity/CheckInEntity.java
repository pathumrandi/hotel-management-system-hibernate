/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.entity;

import edu.ijse.hibernate.dto.CheckInDetailDto;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
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
@Table(name="CheckIn")
public class CheckInEntity {
    
    @Id
    @Column(name="ReservationID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;
    
    @Column(name = "CustID", length = 50, nullable = false)
    private Integer custId;
    
    @Column(name = "Date", length = 50, nullable = false)
    private String date;
    
    @Transient
    @OneToMany(mappedBy = "entity", targetEntity = CheckInDetailDto.class)
    private List<CheckInDetailDto> dtos;
}
