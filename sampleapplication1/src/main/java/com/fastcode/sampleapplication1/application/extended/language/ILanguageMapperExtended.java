package com.fastcode.sampleapplication1.application.extended.language;

import com.fastcode.sampleapplication1.application.core.language.ILanguageMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ILanguageMapperExtended extends ILanguageMapper {}
