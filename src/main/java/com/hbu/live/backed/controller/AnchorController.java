package com.hbu.live.backed.controller;

import com.hbu.live.backed.service.AnchorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("anchors")
public class AnchorController {
    @Autowired
    AnchorService anchorService;

    @RequestMapping( method = RequestMethod.GET)
    public ResponseEntity testAnchor(){

        return  ResponseEntity.ok().body(anchorService.getAnchor());
    }
}
