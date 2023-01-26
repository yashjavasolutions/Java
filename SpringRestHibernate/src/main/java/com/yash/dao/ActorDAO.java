package com.yash.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.entity.Actor;
@Transactional
@Repository
public class ActorDAO implements IActorDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	public List<Actor> getAllActors() {
		String hql = "FROM Actor as atcl ORDER BY atcl.actorId";
		return (List<Actor>) entityManager.createQuery(hql).getResultList();
	}
	
	public Actor getActorById(int actorId) {
		return entityManager.find(Actor.class, actorId);
	}
}
