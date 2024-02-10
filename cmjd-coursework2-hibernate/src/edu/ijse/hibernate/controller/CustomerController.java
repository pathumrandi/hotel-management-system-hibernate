/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class CustomerController {
    
    private final CustomerService CUSTOMER_SERVICE = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        return CUSTOMER_SERVICE.saveCustomer(customerDto);
    }

    public List<CustomerDto> getAll() throws Exception {
        return CUSTOMER_SERVICE.getAllCustomers();
    }
    
}
