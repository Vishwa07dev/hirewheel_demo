package com.upgrad.hirewheels.utils;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;


public class POJOConvertor {

  public static VehicleDTO covertUserEntityToDTO(Vehicle vehicle) {
    VehicleDTO vehicleDTO = new VehicleDTO();


    return vehicleDTO;
  }

  public static Vehicle covertUserDTOToEntity(VehicleDTO userDTO) {
    Vehicle user = new Vehicle();


    return user;
  }
}
