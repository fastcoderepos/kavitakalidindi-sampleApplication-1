package com.fastcode.sampleapplication1.application.extended.country;

import com.fastcode.sampleapplication1.application.core.country.ICountryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICountryMapperExtended extends ICountryMapper {}
