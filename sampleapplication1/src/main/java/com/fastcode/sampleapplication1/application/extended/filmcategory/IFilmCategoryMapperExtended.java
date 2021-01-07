package com.fastcode.sampleapplication1.application.extended.filmcategory;

import com.fastcode.sampleapplication1.application.core.filmcategory.IFilmCategoryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IFilmCategoryMapperExtended extends IFilmCategoryMapper {}
