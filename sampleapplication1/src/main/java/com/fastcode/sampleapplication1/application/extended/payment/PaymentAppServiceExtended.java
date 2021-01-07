package com.fastcode.sampleapplication1.application.extended.payment;

import com.fastcode.sampleapplication1.application.core.payment.PaymentAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.payment.IPaymentRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.staff.IStaffRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("paymentAppServiceExtended")
public class PaymentAppServiceExtended extends PaymentAppService implements IPaymentAppServiceExtended {

    public PaymentAppServiceExtended(
        IPaymentRepositoryExtended paymentRepositoryExtended,
        ICustomerRepositoryExtended customerRepositoryExtended,
        IRentalRepositoryExtended rentalRepositoryExtended,
        IStaffRepositoryExtended staffRepositoryExtended,
        IPaymentMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            paymentRepositoryExtended,
            customerRepositoryExtended,
            rentalRepositoryExtended,
            staffRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
