package com.fastcode.sampleapplication1.application.extended.payment;

import com.fastcode.sampleapplication1.application.core.payment.IPaymentMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPaymentMapperExtended extends IPaymentMapper {}
