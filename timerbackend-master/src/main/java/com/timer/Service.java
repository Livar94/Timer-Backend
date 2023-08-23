package com.timer;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@org.springframework.stereotype.Service
public class Service {
    private final Repository repositoryTid;

    @Autowired
    public Service(Repository repositoryTid) {
        this.repositoryTid = repositoryTid;
    }

    public void saveTheTime(String time, UUID timerId) {
        Entity timer = new Entity();
        timer.setTimerId(timerId);
        timer.setTime(time);
        repositoryTid.save(timer);
    }

    public List<String> getTheTimes() {
        List<Entity> timers = repositoryTid.findAll();
        List<String> times = new ArrayList<>();
        for (Entity timer : timers) {
            times.add(timer.getTime());
        }
        return times;
    }
}




