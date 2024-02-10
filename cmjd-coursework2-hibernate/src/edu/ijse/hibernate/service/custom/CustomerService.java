/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.service.custom;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.service.SuperService;
import java.util.List;

/**
 *
 * @author pathum
 */
public interface CustomerService extends SuperService{
    String saveCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto) throws Exception;
    String deleteCustomer(String custId) throws Exception;
    CustomerDto getCustomer(String custId) throws Exception;
    List<CustomerDto> getAllCustomers() throws Exception;
}
