package com.fastcode.sampleapplication1.application.extended.country;

import com.fastcode.sampleapplication1.application.core.country.CountryAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.country.ICountryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("countryAppServiceExtended")
public class CountryAppServiceExtended extends CountryAppService implements ICountryAppServiceExtended {

    public CountryAppServiceExtended(
        ICountryRepositoryExtended countryRepositoryExtended,
        ICountryMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(countryRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
