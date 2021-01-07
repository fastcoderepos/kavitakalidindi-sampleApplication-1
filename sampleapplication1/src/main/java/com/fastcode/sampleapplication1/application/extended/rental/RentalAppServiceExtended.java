package com.fastcode.sampleapplication1.application.extended.rental;

import com.fastcode.sampleapplication1.application.core.rental.RentalAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.staff.IStaffRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("rentalAppServiceExtended")
public class RentalAppServiceExtended extends RentalAppService implements IRentalAppServiceExtended {

    public RentalAppServiceExtended(
        IRentalRepositoryExtended rentalRepositoryExtended,
        ICustomerRepositoryExtended customerRepositoryExtended,
        IInventoryRepositoryExtended inventoryRepositoryExtended,
        IStaffRepositoryExtended staffRepositoryExtended,
        IRentalMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            rentalRepositoryExtended,
            customerRepositoryExtended,
            inventoryRepositoryExtended,
            staffRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
