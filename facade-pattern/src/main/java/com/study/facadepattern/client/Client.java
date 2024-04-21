package com.study.facadepattern.client;

import com.study.facadepattern.entity.RaffleEvent;
import com.study.facadepattern.service.AppPush;
import com.study.facadepattern.service.EventSearch;
import com.study.facadepattern.service.CouponDispenser;
import com.study.facadepattern.service.EntrantRaffle;
import com.study.facadepattern.service.PointDispenser;

public class Client {

    public static void main(String[] args) {
        // 이벤트 조회
        Long eventId = 1L;
        EventSearch eventSearch = new EventSearch();
        RaffleEvent event = eventSearch.searchEvent(eventId);

        // 당첨자 추첨
        EntrantRaffle entrantRaffle = new EntrantRaffle();
        entrantRaffle.raffle();

        // 쿠폰 지급
        if (event.isCouponBenefitEvent()) {
            CouponDispenser couponDispenser = new CouponDispenser();
            couponDispenser.giveCoupon();
        } else if (event.isPointBenefitEvent()) {
            PointDispenser pointDispenser = new PointDispenser();
            pointDispenser.givePoint();
        }

        // 앱 푸시 발송
        AppPush appPush = new AppPush();
        appPush.sendPush();
    }
}
