package com.toby959.api.controller;

import com.toby959.api.doctor.MedicalRecordData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {


    @PostMapping()
    public void registerDoctor(@RequestBody MedicalRecordData medicalRecordData) {
       // System.out.println("El request llego");
        System.out.println(medicalRecordData);
    }

}
