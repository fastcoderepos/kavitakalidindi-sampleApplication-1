package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.payment.IPaymentAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.rental.IRentalAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.CustomerController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/extended")
public class CustomerControllerExtended extends CustomerController {

    public CustomerControllerExtended(
        ICustomerAppServiceExtended customerAppServiceExtended,
        IAddressAppServiceExtended addressAppServiceExtended,
        IPaymentAppServiceExtended paymentAppServiceExtended,
        IRentalAppServiceExtended rentalAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            customerAppServiceExtended,
            addressAppServiceExtended,
            paymentAppServiceExtended,
            rentalAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
