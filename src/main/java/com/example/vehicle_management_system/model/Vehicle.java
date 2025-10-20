package com.example.vehicle_management_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    
    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;

    @Column(name = "service_year", nullable = false)
    private int serviceYear;

    @Column(name = "vehicle_number", nullable = false)
    private String vehicleNumber;

    @Column(name = "description", nullable = false)
    private String description;
}
