package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.language.ILanguageAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.FilmController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/film/extended")
public class FilmControllerExtended extends FilmController {

    public FilmControllerExtended(
        IFilmAppServiceExtended filmAppServiceExtended,
        IFilmActorAppServiceExtended filmActorAppServiceExtended,
        IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended,
        IInventoryAppServiceExtended inventoryAppServiceExtended,
        ILanguageAppServiceExtended languageAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            filmAppServiceExtended,
            filmActorAppServiceExtended,
            filmCategoryAppServiceExtended,
            inventoryAppServiceExtended,
            languageAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
