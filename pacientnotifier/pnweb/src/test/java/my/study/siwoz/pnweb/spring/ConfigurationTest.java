/**
 *
 */
package my.study.siwoz.pnweb.spring;

import my.study.siwoz.pnweb.conf.BasicConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author jeetemplates
 */
@org.springframework.context.annotation.Configuration
@PropertySources(value = { @PropertySource(value = "classpath:/test-conf.properties") })
@Import(value = BasicConfiguration.class)
public class ConfigurationTest {

}
