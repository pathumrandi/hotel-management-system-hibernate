/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.repository;

import java.util.List;

/**
 *
 * @author pathum
 */
public interface CrudRepository<T, ID> extends SuperRepository{
    Integer save(T t) throws Exception;
    void update(T t) throws Exception;
    void delete(ID id) throws Exception;
    T get(ID id) throws Exception;
    List<T> getAll() throws Exception;
}
