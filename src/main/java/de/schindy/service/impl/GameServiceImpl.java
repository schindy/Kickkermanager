package de.schindy.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.schindy.dao.RoundDAO;
import de.schindy.model.Cast;
import de.schindy.model.Round;
import de.schindy.model.UserCast;
import de.schindy.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private RoundDAO roundDAO;

	public Cast throwDices(UserCast userCast, int gameId) {
		Cast cast = new Cast();
		Cast castBefore = null;
		Round round = roundDAO.findRoundByGameId(gameId);
		
		if(!userCast.castAll()) {
			castBefore = getLastCast(gameId, round);
			if (castBefore == null) {
				throw new RuntimeException("First Cast in Round. All Decies must cast");
			}
		}
		
		if (userCast.isDice1()) {
			cast.setDice1(this.createRandomNumber());
		} else {
			cast.setDice1(castBefore.getDice1());
		}

		if (userCast.isDice2()) {
			cast.setDice2(this.createRandomNumber());
		} else {
			cast.setDice2(castBefore.getDice2());
		}

		if (userCast.isDice3()) {
			cast.setDice3(this.createRandomNumber());
		} else {
			cast.setDice3(castBefore.getDice3());
		}

		if (userCast.isDice4()) {
			cast.setDice4(this.createRandomNumber());
		} else {
			cast.setDice4(castBefore.getDice4());
		}

		if (userCast.isDice5()) {
			cast.setDice5(this.createRandomNumber());
		} else {
			cast.setDice5(castBefore.getDice5());
		}

		if (userCast.isDice6()) {
			cast.setDice6(this.createRandomNumber());
		} else {
			cast.setDice6(castBefore.getDice6());
		}
		int castId = roundDAO.saveCast(cast);
		setCastId(round, castId);
		return cast; 
	}

	private Cast getLastCast(int gameId, Round round) {
		if(round.getCast1ID() == 0) {
			return null;
		} else if (round.getCast2ID() == 0) {
			return roundDAO.findCastById(round.getCast1ID());
		} else if (round.getCast3ID() == 0) {
			return roundDAO.findCastById(round.getCast2ID());
		} else {
			throw new RuntimeException("No free casts in this round");
		}
	}
	
	private void setCastId(Round round, int castId) {
		if(round.getCast1ID() == 0) {
			round.setCast1ID(castId);
		} else if (round.getCast2ID() == 0) {
			round.setCast2ID(castId);
		} else if (round.getCast3ID() == 0) {
			round.setCast3ID(castId);
		} else {
			throw new RuntimeException("Round cannot save Cast");
		}
		roundDAO.updateRound(round);
	}
	
	private int createRandomNumber() {
		Random random = new Random();
		return random.nextInt(6) + 1; 
	}
	

	public void startGame() {
		// TODO Auto-generated method stub
	}

}
