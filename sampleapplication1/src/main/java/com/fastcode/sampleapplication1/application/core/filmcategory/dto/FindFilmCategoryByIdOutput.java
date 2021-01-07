package com.fastcode.sampleapplication1.application.core.filmcategory.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindFilmCategoryByIdOutput {

    private Integer categoryId;
    private Integer filmId;
    private LocalDateTime lastUpdate;
    private Integer categoryDescriptiveField;
    private Integer filmDescriptiveField;
    private Long versiono;
}
