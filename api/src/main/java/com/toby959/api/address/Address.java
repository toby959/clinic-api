package com.toby959.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;

    private Integer number;

    private String addition;

    private String district;

    private String city;

}
