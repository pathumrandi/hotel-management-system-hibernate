/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.service.custom.imple;

import edu.ijse.hibernate.dto.CheckInDto;
import edu.ijse.hibernate.entity.CheckInEntity;
import edu.ijse.hibernate.repository.RepositoryFactory;
import edu.ijse.hibernate.repository.custom.CheckInRepository;
import edu.ijse.hibernate.service.custom.CheckInService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pathum
 */
public class CheckInServiceImple implements CheckInService {

    private final CheckInRepository checkInRepository = (CheckInRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryType.CHECK_IN);

    @Override
    public String saveReservation(CheckInDto dto) throws Exception {
        CheckInEntity e = new CheckInEntity(dto.getReservationId(), dto.getCustId(), dto.getDate(), dto.getDtos());

        if (checkInRepository.save(e) > 0) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteReservation(Integer reservationId) throws Exception {
        checkInRepository.delete(reservationId);
        return "Succesfully delete";
    }

    @Override
    public CheckInDto get(Integer reservationId) throws Exception {
        CheckInEntity e = checkInRepository.get(reservationId);
        CheckInDto dto = new CheckInDto(
                e.getReservationId(),
                e.getCustId(),
                e.getDate(),
                e.getDtos());
        return dto;
    }

    @Override
    public List<CheckInDto> getAll() throws Exception {
        List<CheckInDto> dtos = new ArrayList<>();
        List<CheckInEntity> checkInEntities = checkInRepository.getAll();

        for (CheckInEntity e : checkInEntities) {
            dtos.add(new CheckInDto(
                    e.getReservationId(),
                    e.getCustId(),
                    e.getDate(),
                    e.getDtos()));
        }
        return dtos;
    }

}
