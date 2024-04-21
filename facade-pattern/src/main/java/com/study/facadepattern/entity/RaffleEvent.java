package com.study.facadepattern.entity;

import org.springframework.util.StringUtils;

public class RaffleEvent {

    private final Long eventId;
    private final String benefitType;

    public RaffleEvent(Long eventId) {
        this.eventId = eventId;
        this.benefitType = "coupon";
    }

    public boolean isCouponBenefitEvent() {
        return "coupon".equalsIgnoreCase(this.benefitType);
    }

    public boolean isPointBenefitEvent() {
        return "point".equalsIgnoreCase(this.benefitType);
    }
}
