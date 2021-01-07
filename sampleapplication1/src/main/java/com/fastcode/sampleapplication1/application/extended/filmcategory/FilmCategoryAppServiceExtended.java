package com.fastcode.sampleapplication1.application.extended.filmcategory;

import com.fastcode.sampleapplication1.application.core.filmcategory.FilmCategoryAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.category.ICategoryRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.filmcategory.IFilmCategoryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("filmCategoryAppServiceExtended")
public class FilmCategoryAppServiceExtended extends FilmCategoryAppService implements IFilmCategoryAppServiceExtended {

    public FilmCategoryAppServiceExtended(
        IFilmCategoryRepositoryExtended filmCategoryRepositoryExtended,
        ICategoryRepositoryExtended categoryRepositoryExtended,
        IFilmRepositoryExtended filmRepositoryExtended,
        IFilmCategoryMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(filmCategoryRepositoryExtended, categoryRepositoryExtended, filmRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
