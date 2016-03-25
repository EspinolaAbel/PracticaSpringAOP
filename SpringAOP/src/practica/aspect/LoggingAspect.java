package practica.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		
		System.out.println("Antes de Advice around.");
		try {
			returnValue = proceedingJoinPoint.proceed();//Ejectuto el target
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		System.out.println("Despues Around.");
		
		return returnValue;
	}
	
//	@AfterReturning(pointcut="args(name)")//, returning="unRetorno")
//	public void loggingAdvice(String name) {//, String unRetorno) {
//		System.out.println("Pointcut intercepto el String: "
//							+ name
//							);//+ " y es retorno del método es: "
//							//+ unRetorno);
//	}
	
	
//	@Before("allGetters()")
//	public void loggingAdvice() {
//		System.out.println("Advice run. Get method called.");
//	}
	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		System.out.println("Second advice.");
//	}

	@Pointcut("execution(public * get*())")
	public void allGetters() {}

//	@Pointcut("execution(* * practica.model.Circle.*(..))")
//	public void allCircleMethods() {}
//		-Aplica a todos los métodos de la clase Circle
//	
//	IDEM a
//	
//	@Pointcut("within(practica.model.Circle")
//	public void allCircleMethods() {}
//		-Aplica a todos los métodos de la clase Circle
}
//----------------------------------------------------------------
//		* es un comodín para una sola palabra
//		.. es un comodín para cero o más palabras
//----------------------------------------------------------------
//		@Before("execution(public String getName())")
//			-Todos los métodos cuyo nombre sea public String getName()

//		@Before("execution(public String practica.model.Circle.getName())")
//			-Solo el método de la clase especificada

//		@Before("execution(public String get*())")
//			-Todos los métodos cuyo mensaje empiece con public String get
//			* es un wildcard

//		@Pointcut("execution(public * get*())")
//		public void allGetters() {}
//			-Los pointCuts me permiten generalizar un punto en donde se deben ejecutar los advice definidos que 
//			referencien a allGetters() en su anotacion