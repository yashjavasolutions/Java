package com.yash.service;

import java.util.List;

import com.yash.entity.Actor;

public interface IActorService {
     List<Actor> getAllActors();
     Actor getActorById(int actorId);
   
}
