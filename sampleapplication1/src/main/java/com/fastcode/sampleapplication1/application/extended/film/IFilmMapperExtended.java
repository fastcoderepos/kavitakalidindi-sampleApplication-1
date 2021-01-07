package com.fastcode.sampleapplication1.application.extended.film;

import com.fastcode.sampleapplication1.application.core.film.IFilmMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IFilmMapperExtended extends IFilmMapper {}
