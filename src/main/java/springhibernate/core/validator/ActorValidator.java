package springhibernate.core.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import springhibernate.core.model.Actor;

public class ActorValidator implements Validator{

	public ActorValidator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Actor.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "actorId", "actorId.required");
		Actor actor = (Actor)obj;
		if(actor.getActorId() <= 0){
			errors.rejectValue("actorId", "negativeValue", new Object[] {"'actorId'"}, "id can't be negative");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required");
		
	}

}
