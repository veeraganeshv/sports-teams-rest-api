package com.sportsteam.sports.controller;

import com.sportsteam.sports.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamsController {

    //teams controller

    @PostMapping
    public String addTeam() {
        return "team created";
    }

    // get all the teams as list
    @GetMapping("/getAllTeams")
    public List<Team> getAllTeams() {
        return new ArrayList<>();
    }

}
