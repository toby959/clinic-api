package com.toby959.api.doctor;

import com.toby959.api.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DataUpDateDoctor(
        @NotNull Long id,
        String name,
        String document,
        DataAddress address
) {
}
