package com.toby959.api.doctor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDoctorRepository extends JpaRepository<Doctor, Long> {
    Page<Doctor> findByActivoTrue(Pageable pageable);
}
