package com.study.facadepattern.service;

import com.study.facadepattern.entity.RaffleEvent;

public class EventSearch {

    public RaffleEvent searchEvent(Long eventId) {
        return new RaffleEvent(eventId);
    }
}
