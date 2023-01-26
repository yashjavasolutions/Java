package com.yash.dao;
import java.util.List;
import com.yash.entity.Actor;
public interface IActorDAO {
    List<Actor> getAllActors();
    Actor getActorById(int actorId);
   
}
 