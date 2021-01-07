package com.fastcode.sampleapplication1.application.extended.inventory;

import com.fastcode.sampleapplication1.application.core.inventory.InventoryAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.inventory.IInventoryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("inventoryAppServiceExtended")
public class InventoryAppServiceExtended extends InventoryAppService implements IInventoryAppServiceExtended {

    public InventoryAppServiceExtended(
        IInventoryRepositoryExtended inventoryRepositoryExtended,
        IFilmRepositoryExtended filmRepositoryExtended,
        IInventoryMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(inventoryRepositoryExtended, filmRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
