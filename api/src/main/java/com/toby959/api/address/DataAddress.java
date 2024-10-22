package com.toby959.api.address;

public record DataAddress
    (String street,
    String district,
    String city,
    int number,
    String addition,
    DataAddress address
     )
{}
