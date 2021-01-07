package com.fastcode.sampleapplication1.application.extended.staff;

import com.fastcode.sampleapplication1.application.core.staff.StaffAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.staff.IStaffRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("staffAppServiceExtended")
public class StaffAppServiceExtended extends StaffAppService implements IStaffAppServiceExtended {

    public StaffAppServiceExtended(
        IStaffRepositoryExtended staffRepositoryExtended,
        IAddressRepositoryExtended addressRepositoryExtended,
        IStaffMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(staffRepositoryExtended, addressRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
