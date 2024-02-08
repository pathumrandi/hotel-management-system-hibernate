/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.entity;

import edu.ijse.hibernate.entity.embeded.CustomerName;
import java.util.Date;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

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
@Table(name="customer")
public class CustomerEntity {
    
    @Id
    @Column(name="CustID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custId;
    
    @Column(name = "CustTitle", length = 5, nullable = false)
    private String custTitle;
    
    private CustomerName customername;
    
    @Column(name = "DOB", length = 20, nullable = false)
    private String dob;
    
    @Column(name = "CustAddress", length = 150, nullable = false)
    private String custAddress;
    
    @Column(name = "NIC", length = 12, nullable = false)
    private String nic;
    
    @ElementCollection
    @CollectionTable(
        name = "cust_mobile", 
        joinColumns = @JoinColumn(name = "cust_id"))
    private List<String> mobiles;
    
    
}
