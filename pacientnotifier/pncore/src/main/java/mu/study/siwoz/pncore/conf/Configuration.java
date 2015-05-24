package mu.study.siwoz.pncore.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Autowired
	private Environment environment;
}
