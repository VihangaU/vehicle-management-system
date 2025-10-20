package com.example.vehicle_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle_management_system.model.Vehicle;
import com.example.vehicle_management_system.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/serviced/{year}")
    public ResponseEntity<List<Vehicle>> getVehiclesByServiceYear(@PathVariable int year) {
        List<Vehicle> vehicles = vehicleService.getVehicleByServiceYear(year);
        return ResponseEntity.ok(vehicles);
    }
    
    @GetMapping("/type/{serviceId}")
    public ResponseEntity<String> getVehicleType(@PathVariable Long serviceId) {
        String vehicleType = vehicleService.getVehicleTypeByServiceId(serviceId);
        if (serviceId != null) {
            return ResponseEntity.ok(vehicleType);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
