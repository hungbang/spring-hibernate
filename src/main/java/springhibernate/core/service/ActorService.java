package springhibernate.core.service;

import java.util.List;

import springhibernate.core.model.Actor;

public interface ActorService {
	public Actor saveActor(Actor actor);
	public void deleteActor(int actorId);
	public List<Actor> findAll();
}
