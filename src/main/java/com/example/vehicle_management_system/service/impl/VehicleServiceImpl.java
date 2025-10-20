package com.example.vehicle_management_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle_management_system.model.Vehicle;
import com.example.vehicle_management_system.repository.VehicleRepository;
import com.example.vehicle_management_system.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getVehicleByServiceYear(int year) {
        return vehicleRepository.findByServiceYear(year);
    }

    @Override
    public String getVehicleTypeByServiceId(Long serviceId) {
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }
}
