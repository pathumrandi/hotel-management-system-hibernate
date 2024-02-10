/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.CustomerDto;
import edu.ijse.hibernate.entity.CustomerEntity;
import edu.ijse.hibernate.entity.embeded.CustomerName;
import edu.ijse.hibernate.repository.RepositoryFactory;
import static edu.ijse.hibernate.repository.RepositoryFactory.repositoryType.CUSTOMER;
import edu.ijse.hibernate.repository.custom.CustomerRepository;
import edu.ijse.hibernate.service.custom.CustomerService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pathum
 */
public class CustomerServiceImple implements CustomerService{
    
    private final CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerName customerName = new CustomerName();
        customerName.setFirstName(customerDto.getName1());
        customerName.setLastName(customerDto.getName2());
        CustomerEntity entity = new CustomerEntity(customerDto.getCustId(),
                customerDto.getCustTitle(), 
                customerName,
                customerDto.getDob(),
                customerDto.getCustAddress(),
                customerDto.getNic(),
                customerDto.getMobiles());
        
        if(customerRepository.save(entity)>0){
            return "Successfully Saved";
        }else{
            return "Failed";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteCustomer(String custId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CustomerDto getCustomer(String custId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CustomerDto> getAllCustomers() throws Exception {
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerRepository.getAll();
        
        for (CustomerEntity e : customerEntities) {
            customerDtos.add(new CustomerDto(
                    e.getCustId(),
                    e.getCustTitle(),
                    e.getDob(),
                    e.getCustAddress(),
                    e.getNic(),
                    e.getMobiles(),
                    e.getCustomername().getFirstName(),
                    e.getCustomername().getLastName()));
        }
        return customerDtos;
    }
    
}
