package com.example.vehicle_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.vehicle_management_system.model.Vehicle;

import jakarta.transaction.Transactional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByServiceYear(int serviceYear);

    @Query("SELECT vehicleType FROM Vehicle WHERE serviceId = :serviceId")
    String findVehicleTypeByServiceId(@Param("serviceId") Long serviceId);

    @Transactional
    @Modifying
    void deleteByServiceYear(int serviceYear);
}
