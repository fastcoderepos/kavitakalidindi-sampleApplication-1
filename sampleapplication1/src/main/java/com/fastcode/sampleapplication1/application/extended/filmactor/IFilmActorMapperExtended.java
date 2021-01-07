package com.fastcode.sampleapplication1.application.extended.filmactor;

import com.fastcode.sampleapplication1.application.core.filmactor.IFilmActorMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IFilmActorMapperExtended extends IFilmActorMapper {}
