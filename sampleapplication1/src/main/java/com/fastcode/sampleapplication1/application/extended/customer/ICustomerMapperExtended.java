package com.fastcode.sampleapplication1.application.extended.customer;

import com.fastcode.sampleapplication1.application.core.customer.ICustomerMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapperExtended extends ICustomerMapper {}
