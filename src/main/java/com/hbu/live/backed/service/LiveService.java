package com.hbu.live.backed.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hbu-live-live")
public interface LiveService {
    @RequestMapping(path = "/lives", method = RequestMethod.GET)
    String getLive();
}
