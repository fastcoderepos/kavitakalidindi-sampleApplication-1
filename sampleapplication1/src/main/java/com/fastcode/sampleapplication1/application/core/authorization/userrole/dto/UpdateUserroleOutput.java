package com.fastcode.sampleapplication1.application.core.authorization.userrole.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserroleOutput {

    private Long roleId;
    private Long userId;
    private String roleDescriptiveField;
    private String userDescriptiveField;
}
