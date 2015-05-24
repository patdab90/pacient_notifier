package my.study.siwoz.pncore.adnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
public @interface Loggable {
	LogLevel value() default LogLevel.INFO;
}
