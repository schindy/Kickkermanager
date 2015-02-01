package de.schindy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.schindy.model.Cast;
import de.schindy.model.UserCast;
import de.schindy.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	public void throwDice(UserCast userCast) {
		Cast cast = gameService.throwDices(userCast);
	}

}
