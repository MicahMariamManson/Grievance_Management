package com.example.GrievanceManagementSystem.repositories;

import com.example.GrievanceManagementSystem.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechnicianRepository extends JpaRepository<Technician, Long> {
    Optional<Technician> findByUsername(String username);
}
