/**
 *
 */
package my.study.siwoz.pnweb.conf;

import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import mu.study.siwoz.pncore.conf.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

/**
 * Spring configuration.
 *
 * @author jeetemplates
 */
@org.springframework.context.annotation.Configuration
@ComponentScan(value = "my.study.siwoz.pnweb", excludeFilters = @Filter(type = FilterType.REGEX, pattern = "my.study.siwoz.pnweb.spring.Configuration"))
@EnableTransactionManagement
@EnableJpaRepositories("my.study.siwoz.pnweb")
@Import(value = { Configuration.class })
public class BasicConfiguration {

	@Autowired
	private Environment environment;

	

}
