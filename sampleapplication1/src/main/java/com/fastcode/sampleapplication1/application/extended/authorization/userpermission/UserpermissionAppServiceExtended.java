package com.fastcode.sampleapplication1.application.extended.authorization.userpermission;

import com.fastcode.sampleapplication1.application.core.authorization.userpermission.UserpermissionAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.sampleapplication1.domain.extended.authorization.userpermission.IUserpermissionRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("userpermissionAppServiceExtended")
public class UserpermissionAppServiceExtended
    extends UserpermissionAppService
    implements IUserpermissionAppServiceExtended {

    public UserpermissionAppServiceExtended(
        IUserpermissionRepositoryExtended userpermissionRepositoryExtended,
        IPermissionRepositoryExtended permissionRepositoryExtended,
        IUserRepositoryExtended userRepositoryExtended,
        IUserpermissionMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            userpermissionRepositoryExtended,
            permissionRepositoryExtended,
            userRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
