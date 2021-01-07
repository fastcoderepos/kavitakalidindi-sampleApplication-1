package com.fastcode.sampleapplication1.application.extended.actor;

import com.fastcode.sampleapplication1.application.core.actor.IActorMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IActorMapperExtended extends IActorMapper {}
