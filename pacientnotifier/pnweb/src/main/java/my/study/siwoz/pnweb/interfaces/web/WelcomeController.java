/**
 *
 */
package my.study.siwoz.pnweb.interfaces.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import my.study.siwoz.pncore.dao.HelloWorldRepository;
import my.study.siwoz.pncore.entity.HelloWorld;
import my.study.siwoz.pncore.service.HelloWorldService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Welcome controller.
 *
 * @author jeetemplates
 */
@ManagedBean
public class WelcomeController {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(WelcomeController.class);

	/* ************************************ */
	/* Dependencies */
	/* ************************************ */
	/**
	 * {@link HelloWorldService}
	 */
	@ManagedProperty(value = "#{helloWorldService}")
	private HelloWorldService helloWorldService;

	@ManagedProperty(value = "#{helloWorldRepository}")
	private HelloWorldRepository helloWorldRepository;

	/* ************************************ */
	/* Attributes */
	/* ************************************ */
	/**
	 * List of hellos
	 */
	private List<HelloWorld> hellos;

	/* ************************************ */
	/* Methods */
	/* ************************************ */
	/**
	 * Init.
	 */
	@PostConstruct
	public void init() {
		logger.debug("Initialize hello world list for display");
		hellos = helloWorldRepository.findAll();
	}

	/* ************************************ */
	/* Getters & Setters */
	/* ************************************ */
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public void setHelloWorldRepository(
			HelloWorldRepository helloWorldRepository) {
		this.helloWorldRepository = helloWorldRepository;
	}

	public List<HelloWorld> getHellos() {
		return hellos;
	}

	public void setHellos(List<HelloWorld> hellos) {
		this.hellos = hellos;
	}

}
