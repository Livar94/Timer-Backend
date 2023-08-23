package com.timer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@jakarta.persistence.Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "timer_entity", schema = "timer_DB")
public class Entity {

    @Id

    @Column(name = "timer_id")
    private UUID timerId;

    @Column(name = "time")
    private String time;

}
