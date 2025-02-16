package com.example.springboot_project.service;

import com.example.springboot_project.model.Player;
import com.example.springboot_project.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepo playerRepo;

public List<Player> getPlayers(){
    return playerRepo.findAll();
}
}
