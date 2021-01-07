package com.fastcode.sampleapplication1.application.core.country;

import com.fastcode.sampleapplication1.application.core.country.dto.*;
import com.fastcode.sampleapplication1.domain.core.country.CountryEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICountryMapper {
    CountryEntity createCountryInputToCountryEntity(CreateCountryInput countryDto);

    CreateCountryOutput countryEntityToCreateCountryOutput(CountryEntity entity);

    CountryEntity updateCountryInputToCountryEntity(UpdateCountryInput countryDto);

    UpdateCountryOutput countryEntityToUpdateCountryOutput(CountryEntity entity);

    FindCountryByIdOutput countryEntityToFindCountryByIdOutput(CountryEntity entity);
}
