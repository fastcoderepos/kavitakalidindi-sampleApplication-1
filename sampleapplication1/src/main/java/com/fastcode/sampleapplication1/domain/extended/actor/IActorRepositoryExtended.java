package com.fastcode.sampleapplication1.domain.extended.actor;

import com.fastcode.sampleapplication1.domain.core.actor.IActorRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("actorRepositoryExtended")
public interface IActorRepositoryExtended extends IActorRepository {
    //Add your custom code here
}
