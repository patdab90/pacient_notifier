package my.study.siwoz.pncore.aop;

import my.study.siwoz.pncore.adnotation.Loggable;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LoggerAspect {

	private Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);
	private static final String LOG_FORMAT = "{}#{} start.";

	@Before(value = "@annotation(loggable)")
	public void logBefore(JoinPoint joinPoint, Loggable loggable) {
		Class<?> clazz = joinPoint.getTarget().getClass();
		String name = joinPoint.getSignature().getName();

		switch (loggable.value()) {
		case DEBUG:
			break;
		case ERROR:
		case INFO:
			LOGGER.info(LOG_FORMAT, clazz, name);
		case TRACE:
		case WARN:
		default:
			break;
		}
	}

}
