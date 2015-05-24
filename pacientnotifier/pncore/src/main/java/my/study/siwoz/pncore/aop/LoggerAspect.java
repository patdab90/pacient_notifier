package my.study.siwoz.pncore.aop;

import my.study.siwoz.pncore.adnotation.Loggable;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	@Before(value = "@anotation(my.study.siwoz.pncore..adnotation.Loggable)", argNames = "joinPoint, loggable")
	public void logBefore(JoinPoint joinPoint, Loggable loggable) {
		Class clazz = joinPoint.getTarget().getClass();
		String name = joinPoint.getSignature().getName();
	}
}
