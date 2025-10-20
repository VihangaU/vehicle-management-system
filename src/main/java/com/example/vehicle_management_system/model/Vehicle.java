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

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getServiceYear() {
        return serviceYear;
    }

    public void setServiceYear(int serviceYear) {
        this.serviceYear = serviceYear;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
