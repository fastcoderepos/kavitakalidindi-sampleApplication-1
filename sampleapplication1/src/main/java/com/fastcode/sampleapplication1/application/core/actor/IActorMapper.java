package com.fastcode.sampleapplication1.application.core.actor;

import com.fastcode.sampleapplication1.application.core.actor.dto.*;
import com.fastcode.sampleapplication1.domain.core.actor.ActorEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IActorMapper {
    ActorEntity createActorInputToActorEntity(CreateActorInput actorDto);

    CreateActorOutput actorEntityToCreateActorOutput(ActorEntity entity);

    ActorEntity updateActorInputToActorEntity(UpdateActorInput actorDto);

    UpdateActorOutput actorEntityToUpdateActorOutput(ActorEntity entity);

    FindActorByIdOutput actorEntityToFindActorByIdOutput(ActorEntity entity);
}
