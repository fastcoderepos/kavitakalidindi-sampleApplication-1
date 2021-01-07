package com.fastcode.sampleapplication1.application.extended.authorization.user;

import com.fastcode.sampleapplication1.addons.reporting.domain.dashboardversion.*;
import com.fastcode.sampleapplication1.addons.reporting.domain.dashboardversionreport.*;
import com.fastcode.sampleapplication1.addons.reporting.domain.reportversion.*;
import com.fastcode.sampleapplication1.application.core.authorization.user.UserAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.core.authorization.userpreference.IUserpreferenceRepository;
import com.fastcode.sampleapplication1.domain.extended.authorization.user.IUserRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("userAppServiceExtended")
public class UserAppServiceExtended extends UserAppService implements IUserAppServiceExtended {

    public UserAppServiceExtended(
        IDashboardversionRepository dashboardversionRepository,
        IReportversionRepository reportversionRepository,
        IDashboardversionreportRepository reportDashboardRepository,
        IUserRepositoryExtended userRepositoryExtended,
        IUserpreferenceRepository userpreferenceRepository,
        IUserMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            dashboardversionRepository,
            reportversionRepository,
            reportDashboardRepository,
            userRepositoryExtended,
            userpreferenceRepository,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
