package com.example.parkingApplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Slot {

    @Id
    private String slotId;
    private String type;
    private boolean isEmpty=true;
    private String levelId;

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }
}
