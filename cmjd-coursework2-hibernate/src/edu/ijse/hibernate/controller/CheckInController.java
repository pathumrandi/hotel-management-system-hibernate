/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.controller;

import edu.ijse.hibernate.dto.CheckInDto;
import edu.ijse.hibernate.service.ServiceFactory;
import edu.ijse.hibernate.service.custom.CheckInService;
import java.util.List;

/**
 *
 * @author pathum
 */
public class CheckInController {

    private final CheckInService CHECKIN_SERVICE = (CheckInService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CHECK_IN);
    
    public String placeReservation(CheckInDto dto) throws Exception {
        return CHECKIN_SERVICE.saveReservation(dto);
    }

    public List<CheckInDto> getAll() throws Exception {
        return CHECKIN_SERVICE.getAll();
    }

    public CheckInDto get(Integer id) throws Exception {
        return CHECKIN_SERVICE.get(id);
    }

    public String delete(Integer id) throws Exception {
        return CHECKIN_SERVICE.deleteReservation(id);
    }
    
}
