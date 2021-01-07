package com.fastcode.sampleapplication1.application.extended.city;

import com.fastcode.sampleapplication1.application.core.city.ICityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICityMapperExtended extends ICityMapper {}
