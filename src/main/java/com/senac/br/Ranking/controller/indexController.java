package com.senac.br.Ranking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class indexController {

@GetMapping("/index")
    public String open(){
    return "index";
}

}
