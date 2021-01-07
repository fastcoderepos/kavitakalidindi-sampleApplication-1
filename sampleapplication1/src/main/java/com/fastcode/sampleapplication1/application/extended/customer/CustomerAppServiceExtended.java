package com.fastcode.sampleapplication1.application.extended.customer;

import com.fastcode.sampleapplication1.application.core.customer.CustomerAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.customer.ICustomerRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

    public CustomerAppServiceExtended(
        ICustomerRepositoryExtended customerRepositoryExtended,
        IAddressRepositoryExtended addressRepositoryExtended,
        ICustomerMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(customerRepositoryExtended, addressRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
