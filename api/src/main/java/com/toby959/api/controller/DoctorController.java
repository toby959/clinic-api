package com.toby959.api.controller;

import com.toby959.api.doctor.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    private final IDoctorRepository repository;

    public DoctorController(IDoctorRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public void registerDoctor(@RequestBody @Valid MedicalRecordData medicalRecordData) {
    repository.save(new Doctor(medicalRecordData));
    }

    @GetMapping
    public Page<DataListDoctors> listDoctors(@PageableDefault(size = 2) Pageable pageable) {
        //return repository.findAll(pageable).map(DataListDoctors::new);
        return repository.findByActivoTrue(pageable).map(DataListDoctors::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public void updateDoctor(@PathVariable Long id, @RequestBody DataUpDateDoctor dataUpDateDoctor) {
        Doctor doctor = repository.getReferenceById(id);
        doctor.updateData(dataUpDateDoctor);
        repository.save(doctor);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteDoctor(@PathVariable Long id) {
        Doctor doctor = repository.getReferenceById(id);
        doctor.disarmDoctor();
    }
//    public void deleteDoctor(@PathVariable Long id) {
//        Doctor doctor = repository.getReferenceById(id);
//        repository.deleteById(doctor.getId());
//     }


}
