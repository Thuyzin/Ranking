package com.senac.br.Ranking.controller;
import com.senac.br.Ranking.dao.PlayerR;
import com.senac.br.Ranking.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class cadastroController {

    @Autowired
    PlayerR PlayerR;

    @GetMapping("/cadastroRanking")
    public String abrir(Player player) {
        return "cadastroRanking";
    }

    @PostMapping("/cadastroRanking")
    public String cadastro(Player player){
    PlayerR.save(player);
    return "index";
    }
}
