/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate.dto;

import java.util.List;
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
public class CheckInDto {
    private Integer reservationId;
    private Integer custId;
    private String date;
    private List<CheckInDetailDto> dtos;
}
