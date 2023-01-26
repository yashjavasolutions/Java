package com.yash.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.yash.entity.Actor;
import com.yash.service.IActorService;

@RestController
@CrossOrigin
@RequestMapping("user")
public class ActorController {
	@Autowired
	private IActorService actorService;
	@GetMapping("actor/{id}")
	public ResponseEntity<Actor> getActorById(@PathVariable("id") Integer id) {
		Actor actor = actorService.getActorById(id);
		return new ResponseEntity<Actor>(actor, HttpStatus.OK);
	}
	@GetMapping("actors")
	public ResponseEntity<List<Actor>> getAllActors() {
		List<Actor> list = actorService.getAllActors();
		return new ResponseEntity<List<Actor>>(list, HttpStatus.OK);
	}
	
} 