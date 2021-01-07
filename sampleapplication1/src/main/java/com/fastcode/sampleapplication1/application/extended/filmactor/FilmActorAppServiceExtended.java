package com.fastcode.sampleapplication1.application.extended.filmactor;

import com.fastcode.sampleapplication1.application.core.filmactor.FilmActorAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.filmactor.IFilmActorRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

    public FilmActorAppServiceExtended(
        IFilmActorRepositoryExtended filmActorRepositoryExtended,
        IActorRepositoryExtended actorRepositoryExtended,
        IFilmRepositoryExtended filmRepositoryExtended,
        IFilmActorMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(filmActorRepositoryExtended, actorRepositoryExtended, filmRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
