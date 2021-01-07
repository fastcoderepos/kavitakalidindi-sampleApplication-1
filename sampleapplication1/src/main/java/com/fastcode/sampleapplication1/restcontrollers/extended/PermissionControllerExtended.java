package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.PermissionController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permission/extended")
public class PermissionControllerExtended extends PermissionController {

    public PermissionControllerExtended(
        IPermissionAppServiceExtended permissionAppServiceExtended,
        IRolepermissionAppServiceExtended rolepermissionAppServiceExtended,
        IUserpermissionAppServiceExtended userpermissionAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            permissionAppServiceExtended,
            rolepermissionAppServiceExtended,
            userpermissionAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
