package practica.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
		
	@Before("execution(public String practica.model.Circle.getName())")
	public void loggingAdvice() {
		System.out.println("Advice run. Get method called.");
	}
}
