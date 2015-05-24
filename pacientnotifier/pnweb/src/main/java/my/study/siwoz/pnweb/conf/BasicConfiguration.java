/**
 *
 */
package my.study.siwoz.pnweb.conf;

import my.study.siwoz.pncore.conf.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 * Spring configuration.
 *
 */
@org.springframework.context.annotation.Configuration
@ComponentScan(value = "my.study.siwoz.pnweb", excludeFilters = @Filter(type = FilterType.REGEX, pattern = "my.study.siwoz.pnweb.spring.Configuration"))
@Import(value = { Configuration.class })
public class BasicConfiguration {

	@Autowired
	private Environment environment;

}
