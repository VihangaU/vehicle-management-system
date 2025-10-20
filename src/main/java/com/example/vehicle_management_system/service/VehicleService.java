package com.example.vehicle_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vehicle_management_system.model.Vehicle;

@Service
public interface VehicleService {
    List<Vehicle> getVehicleByServiceYear(int year);
    String getVehicleTypeByServiceId(Long serviceId);
    void deleteServiceByServiceYear(int year);
}
