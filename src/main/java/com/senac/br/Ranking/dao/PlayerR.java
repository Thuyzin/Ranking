package com.senac.br.Ranking.dao;

import com.senac.br.Ranking.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerR extends JpaRepository<Player, Integer> {
}
