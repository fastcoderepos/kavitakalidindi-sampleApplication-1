package com.fastcode.sampleapplication1.application.core.filmactor.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateFilmActorOutput {

    private Integer actorId;
    private Integer filmId;
    private LocalDateTime lastUpdate;
    private Integer actorDescriptiveField;
    private Integer filmDescriptiveField;
}
