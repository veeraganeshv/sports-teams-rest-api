package com.sportsteam.sports.controller;

import com.sportsteam.sports.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SportsController {

    //sports controller

    public String addPlayer() {
        return "player successfully added";
    }

    // get all the players of a team as list

    @GetMapping
    public List<Player> getPlayers(String team) {
        return new ArrayList<>();
    }
}
