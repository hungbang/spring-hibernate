package springhibernate.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springhibernate.core.model.Actor;
import springhibernate.core.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepository;
	
	@Override
	@Transactional
	public Actor saveActor(Actor actor) {
		// TODO Auto-generated method stub
		return actorRepository.saveAndFlush(actor);
	}

	@Override
	@Transactional
	public void deleteActor(int actorId) {
		actorRepository.delete(actorId);
	}

	@Override
	public List<Actor> findAll() {
		return actorRepository.findAll();
	}

}
