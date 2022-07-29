package com.apitraining.tennisapi.controller;

import com.apitraining.tennisapi.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @GetMapping("/fetch")
    public List<Player> fetchAll() {
        Player player = new Player();
        player.setName("Carlo");
        player.setYearsPlayed(1);
        Player secondPlayer = new Player();
        secondPlayer.setName("Julia");
        secondPlayer.setYearsPlayed(2);
        List<Player> playerList = new ArrayList<>();
        playerList.add(player);
        playerList.add(secondPlayer);
        return playerList;
    }
}
