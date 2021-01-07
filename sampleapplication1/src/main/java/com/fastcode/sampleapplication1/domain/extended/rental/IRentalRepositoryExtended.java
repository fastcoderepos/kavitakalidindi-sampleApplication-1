package com.fastcode.sampleapplication1.domain.extended.rental;

import com.fastcode.sampleapplication1.domain.core.rental.IRentalRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("rentalRepositoryExtended")
public interface IRentalRepositoryExtended extends IRentalRepository {
    //Add your custom code here
}
