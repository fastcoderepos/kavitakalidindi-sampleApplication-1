package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.actor.IActorAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.FilmActorController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmActor/extended")
public class FilmActorControllerExtended extends FilmActorController {

    public FilmActorControllerExtended(
        IFilmActorAppServiceExtended filmActorAppServiceExtended,
        IActorAppServiceExtended actorAppServiceExtended,
        IFilmAppServiceExtended filmAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(filmActorAppServiceExtended, actorAppServiceExtended, filmAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
