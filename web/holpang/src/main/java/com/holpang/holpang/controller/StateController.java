package com.holpang.holpang.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class StateController {

    @GetMapping
    public String holPangState(){

        return "holpang/holpang_State";
    }
}
