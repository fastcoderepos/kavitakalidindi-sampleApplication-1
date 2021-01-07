package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.UserpermissionController;
import com.fastcode.sampleapplication1.security.JWTAppService;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userpermission/extended")
public class UserpermissionControllerExtended extends UserpermissionController {

    public UserpermissionControllerExtended(
        IUserpermissionAppServiceExtended userpermissionAppServiceExtended,
        IPermissionAppServiceExtended permissionAppServiceExtended,
        IUserAppServiceExtended userAppServiceExtended,
        JWTAppService jwtAppService,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            userpermissionAppServiceExtended,
            permissionAppServiceExtended,
            userAppServiceExtended,
            jwtAppService,
            helper,
            env
        );
    }
    //Add your custom code here

}
