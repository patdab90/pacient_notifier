/**
 *
 */
package my.study.siwoz.pnweb.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import my.study.siwoz.pnweb.domain.HelloWorld;
import my.study.siwoz.pnweb.domain.HelloWorldRepository;

/**
 * @author jeetemplates
 */
@Service("helloWorldService")
public class HelloWorldService {

	/* ************************************ */
	/* Dependencies */
	/* ************************************ */
	/**
	 * {@link HelloWorldRepository}
	 */
	@Autowired
	private HelloWorldRepository helloWorldRepository;

	/* ************************************ */
	/* Methods */
	/* ************************************ */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public HelloWorld create(HelloWorld entity) {
		return helloWorldRepository.save(entity);
	}

}
