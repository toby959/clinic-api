package com.toby959.api.doctor;

import com.toby959.api.address.Address;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "doctor")
@Table(name = "doctors")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String document;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

}
