package com.hbu.live.backed.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hbu-live-anchor")
public interface AnchorService {
    @RequestMapping(path = "/anchors", method = RequestMethod.GET)
    String getAnchor();
}
