package com.fastcode.sampleapplication1.application.extended.category;

import com.fastcode.sampleapplication1.application.core.category.ICategoryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICategoryMapperExtended extends ICategoryMapper {}
