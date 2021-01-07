package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.category.ICategoryAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.FilmCategoryController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmCategory/extended")
public class FilmCategoryControllerExtended extends FilmCategoryController {

    public FilmCategoryControllerExtended(
        IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended,
        ICategoryAppServiceExtended categoryAppServiceExtended,
        IFilmAppServiceExtended filmAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(filmCategoryAppServiceExtended, categoryAppServiceExtended, filmAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
