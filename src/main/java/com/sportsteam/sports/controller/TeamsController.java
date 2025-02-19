package com.sportsteam.sports.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {

    //teams controller
    @PostMapping
    public String addTeam() {
        return "team created";
    }

}
