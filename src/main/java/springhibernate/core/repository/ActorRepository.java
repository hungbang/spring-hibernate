package springhibernate.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import springhibernate.core.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
