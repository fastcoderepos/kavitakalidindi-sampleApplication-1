package com.fastcode.sampleapplication1.application.extended.authorization.user;

import com.fastcode.sampleapplication1.application.core.authorization.user.IUserMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserMapperExtended extends IUserMapper {}
