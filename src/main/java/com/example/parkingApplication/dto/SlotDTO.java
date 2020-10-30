package com.example.parkingApplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlotDTO {

    private String slotId;
    private String type;
    private boolean isEmpty;
    private String levelId;
}
