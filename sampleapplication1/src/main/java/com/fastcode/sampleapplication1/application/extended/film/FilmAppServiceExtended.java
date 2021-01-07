package com.fastcode.sampleapplication1.application.extended.film;

import com.fastcode.sampleapplication1.application.core.film.FilmAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.language.ILanguageRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("filmAppServiceExtended")
public class FilmAppServiceExtended extends FilmAppService implements IFilmAppServiceExtended {

    public FilmAppServiceExtended(
        IFilmRepositoryExtended filmRepositoryExtended,
        ILanguageRepositoryExtended languageRepositoryExtended,
        IFilmMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(filmRepositoryExtended, languageRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
