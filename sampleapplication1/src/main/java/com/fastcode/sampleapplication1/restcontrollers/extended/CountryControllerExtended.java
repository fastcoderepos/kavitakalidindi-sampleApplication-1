package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.city.ICityAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.country.ICountryAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.CountryController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country/extended")
public class CountryControllerExtended extends CountryController {

    public CountryControllerExtended(
        ICountryAppServiceExtended countryAppServiceExtended,
        ICityAppServiceExtended cityAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(countryAppServiceExtended, cityAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
