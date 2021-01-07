package com.fastcode.sampleapplication1.application.extended.staff;

import com.fastcode.sampleapplication1.application.core.staff.IStaffMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IStaffMapperExtended extends IStaffMapper {}
