package com.fastcode.sampleapplication1.application.extended.rental;

import com.fastcode.sampleapplication1.application.core.rental.IRentalMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IRentalMapperExtended extends IRentalMapper {}
