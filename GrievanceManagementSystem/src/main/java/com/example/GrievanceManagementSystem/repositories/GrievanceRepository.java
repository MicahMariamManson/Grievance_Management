package com.example.GrievanceManagementSystem.repositories;

import com.example.GrievanceManagementSystem.model.Grievance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
    List<Grievance> findByUsername(String username);
    List<Grievance> findByTechnicianId(Long technicianId);
    List<Grievance> findByTechnicianIdIsNull();
}
