package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.sampleapplication1.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.restcontrollers.core.RoleController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role/extended")
public class RoleControllerExtended extends RoleController {

    public RoleControllerExtended(
        IRoleAppServiceExtended roleAppServiceExtended,
        IRolepermissionAppServiceExtended rolepermissionAppServiceExtended,
        IUserroleAppServiceExtended userroleAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(roleAppServiceExtended, rolepermissionAppServiceExtended, userroleAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
