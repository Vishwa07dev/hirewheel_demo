package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.services.VehicleService;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/hirewheels/v1")
public class VehicleController {

  @Autowired
  private ModelMapper modelMapper;

  @Autowired
  private VehicleService vehicleService;

  @GetMapping("/vehicles")
  public ResponseEntity getAvailableVehicles() {

    ResponseEntity responseEntity = null;
    List<Vehicle> vehiclesList = new ArrayList<>();
    vehiclesList = vehicleService.getAllVehicles();

    List<VehicleDTO> vehicleDTOList = new ArrayList<>();
    for (Vehicle vehicle : vehiclesList) {
      vehicleDTOList.add(modelMapper.map(vehicle, VehicleDTO.class));
    }
    return new ResponseEntity<>(vehicleDTOList, HttpStatus.OK);
  }
}
