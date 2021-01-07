package com.fastcode.sampleapplication1.application.extended.category;

import com.fastcode.sampleapplication1.application.core.category.CategoryAppService;
import com.fastcode.sampleapplication1.commons.logging.LoggingHelper;
import com.fastcode.sampleapplication1.domain.extended.category.ICategoryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("categoryAppServiceExtended")
public class CategoryAppServiceExtended extends CategoryAppService implements ICategoryAppServiceExtended {

    public CategoryAppServiceExtended(
        ICategoryRepositoryExtended categoryRepositoryExtended,
        ICategoryMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(categoryRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
