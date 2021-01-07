package com.fastcode.sampleapplication1.application.extended.store;

import com.fastcode.sampleapplication1.application.core.store.IStoreMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IStoreMapperExtended extends IStoreMapper {}
