package com.fastcode.sampleapplication1.domain.extended.category;

import com.fastcode.sampleapplication1.domain.core.category.ICategoryRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("categoryRepositoryExtended")
public interface ICategoryRepositoryExtended extends ICategoryRepository {
    //Add your custom code here
}
