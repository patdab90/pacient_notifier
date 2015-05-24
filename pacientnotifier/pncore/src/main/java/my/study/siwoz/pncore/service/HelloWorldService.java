/**
 *
 */
package my.study.siwoz.pncore.service;

import my.study.siwoz.pncore.dao.HelloWorldRepository;
import my.study.siwoz.pncore.entity.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
