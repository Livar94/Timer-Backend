package com.timer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;
//DTO
@ToString
@NoArgsConstructor
@Data
public class RequestTidDTO {
    private String time;
    private UUID timerId;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public UUID getTimerId() {
        return timerId;
    }

    public void setTimerId(UUID timerId) {
        this.timerId = timerId;
    }


}
