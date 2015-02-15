package de.schindy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.schindy.dao.RoundDAO;
import de.schindy.dao.UserDAO;
import de.schindy.model.Cast;
import de.schindy.model.Round;
import de.schindy.model.UserCast;
import de.schindy.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private RoundDAO roundDAO;

	public Cast throwDices(UserCast userCast) {
		Cast cast = new Cast();
		
		if(!userCast.castAll()) {
			//Cast castBefore = getCastbefore();
			//if castbefore null throw new RuntimeException("First Cast in Round. All Decies must cast");
		}
		
		if (userCast.isDice1()) {
			cast.getDice1().roll();
		} else {
			// get value before
		}

		if (userCast.isDice2()) {
			cast.getDice2().roll();
		} else {
			// get value before
		}

		if (userCast.isDice3()) {
			cast.getDice3().roll();
		} else {
			// get value before
		}

		if (userCast.isDice4()) {
			cast.getDice4().roll();
		} else {
			// get value before
		}

		if (userCast.isDice5()) {
			cast.getDice5().roll();
		} else {
			// get value before
		}

		if (userCast.isDice6()) {
			cast.getDice1().roll();
		} else {
			// get value before
		}
		
		return cast;

	}

	public Cast getLastCast(int roundID) {
		Round round = roundDAO.findRoundById(roundID);
		if(round.getCast1ID() == null) {
			return null;
		} else if (round.getCast2ID() == null) {
			return findCastByID(round.getCast1ID());
		} else if (round.getCast3ID() == null) {
			return findCastByID(round.getCast2ID());
		} else {
			throw new RuntimeException("No free casts in this round");
		}
	}
}
