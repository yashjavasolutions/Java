package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.IActorDAO;
import com.yash.entity.Actor;
@Service
public class ActorService implements IActorService {
	@Autowired
	private IActorDAO actorDAO;
	

	public List<Actor> getAllActors() {
		// TODO Auto-generated method stub
		return actorDAO.getAllActors();
	}
	public Actor getActorById(int actorId) {
		Actor obj = actorDAO.getActorById(actorId);
		return obj;
	}

}
