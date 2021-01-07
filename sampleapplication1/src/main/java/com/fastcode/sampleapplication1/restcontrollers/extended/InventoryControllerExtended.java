package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.rental.IRentalAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.InventoryController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory/extended")
public class InventoryControllerExtended extends InventoryController {

    public InventoryControllerExtended(
        IInventoryAppServiceExtended inventoryAppServiceExtended,
        IFilmAppServiceExtended filmAppServiceExtended,
        IRentalAppServiceExtended rentalAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(inventoryAppServiceExtended, filmAppServiceExtended, rentalAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
