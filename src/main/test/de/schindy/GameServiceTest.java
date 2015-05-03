package de.schindy;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.schindy.model.UserCast;
import de.schindy.service.GameService;

public class GameServiceTest {

	@Autowired
	private GameService gameService;
	
	@Test
	public void firstTest() {
		int gameId = gameService.startGame(1);
		UserCast userCast = new UserCast(true, true, true, true, true, true);
		gameService.throwDices(userCast, gameId);
	}
}
