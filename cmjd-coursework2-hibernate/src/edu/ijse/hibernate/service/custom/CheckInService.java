/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.hibernate.service.custom;

import edu.ijse.hibernate.dto.CheckInDto;
import edu.ijse.hibernate.service.SuperService;
import java.util.List;

/**
 *
 * @author pathum
 */
public interface CheckInService extends SuperService{
    String saveReservation(CheckInDto dto) throws Exception;
    String deleteReservation(Integer reservationId) throws Exception;
    CheckInDto get(Integer reservationId) throws Exception;
    List<CheckInDto> getAll() throws Exception;
}
