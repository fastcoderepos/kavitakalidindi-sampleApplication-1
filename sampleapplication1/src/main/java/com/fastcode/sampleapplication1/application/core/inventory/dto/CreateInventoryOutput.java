package com.fastcode.sampleapplication1.application.core.inventory.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateInventoryOutput {

    private Integer inventoryId;
    private LocalDateTime lastUpdate;
    private Short storeId;
    private Integer filmId;
    private Integer filmDescriptiveField;
}
