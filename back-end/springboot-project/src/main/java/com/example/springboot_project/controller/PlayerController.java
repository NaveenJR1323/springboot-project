package com.example.springboot_project.controller;

import com.example.springboot_project.model.Player;
import com.example.springboot_project.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    PlayerService playerService;
    @RequestMapping("/players")
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

}
