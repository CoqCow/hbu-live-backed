package com.hbu.live.backed.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hbu-live-user")
public interface UserService {
    @RequestMapping(path = "/users", method = RequestMethod.GET)
    String getUser();
}
