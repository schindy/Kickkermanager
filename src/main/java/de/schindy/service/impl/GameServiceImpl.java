package de.schindy.service.impl;

import org.springframework.stereotype.Service;

import de.schindy.model.Cast;
import de.schindy.model.UserCast;
import de.schindy.service.GameService;

@Service
public class GameServiceImpl implements GameService {

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
}
