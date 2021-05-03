package com.skycloud.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MissionController {

    @RequestMapping("/mission/main")
    public String mission(){
        return "mission";
    }
}
