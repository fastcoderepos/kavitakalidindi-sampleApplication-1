package com.fastcode.sampleapplication1.application.extended.address;

import com.fastcode.sampleapplication1.application.core.address.IAddressMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAddressMapperExtended extends IAddressMapper {}
