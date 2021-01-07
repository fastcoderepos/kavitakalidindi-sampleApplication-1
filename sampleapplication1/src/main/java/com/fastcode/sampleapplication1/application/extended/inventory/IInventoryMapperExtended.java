package com.fastcode.sampleapplication1.application.extended.inventory;

import com.fastcode.sampleapplication1.application.core.inventory.IInventoryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IInventoryMapperExtended extends IInventoryMapper {}
