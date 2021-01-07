package com.fastcode.sampleapplication1.application.extended.city;

import com.fastcode.sampleapplication1.application.core.city.CityAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.city.ICityRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.country.ICountryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("cityAppServiceExtended")
public class CityAppServiceExtended extends CityAppService implements ICityAppServiceExtended {

    public CityAppServiceExtended(
        ICityRepositoryExtended cityRepositoryExtended,
        ICountryRepositoryExtended countryRepositoryExtended,
        ICityMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(cityRepositoryExtended, countryRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
