package com.fastcode.sampleapplication1.application.core.city.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCityOutput {

    private String city;
    private Integer cityId;
    private LocalDateTime lastUpdate;
    private Integer countryId;
    private Integer countryDescriptiveField;
}
