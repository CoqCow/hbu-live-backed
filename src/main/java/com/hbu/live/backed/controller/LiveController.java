package com.hbu.live.backed.controller;

import com.hbu.live.backed.service.AnchorService;
import com.hbu.live.backed.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lives")
public class LiveController {
    @Autowired
    LiveService liveService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity testLive(){

        return  ResponseEntity.ok().body(liveService.getLive());
    }
}
