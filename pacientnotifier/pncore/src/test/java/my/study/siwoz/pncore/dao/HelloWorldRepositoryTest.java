/**
 *
 */
package my.study.siwoz.pncore.dao;

import java.io.FileInputStream;
import java.util.List;

import my.study.siwoz.pncore.common.repository.BaseRepositoryTest;
import my.study.siwoz.pncore.entity.HelloWorld;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test of {@link HelloWorldDao}.
 *
 * @author jeetemplates
 */
public class HelloWorldRepositoryTest extends BaseRepositoryTest {

	/**
	 * {@link HelloWorldDao}.
	 */
	@Autowired
	private HelloWorldRepository helloWorldRepository;

	/**
	 * @return @throws java.lang.Exception
	 * @see org.dbunit.DatabaseTestCase#getDataSet()
	 */
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"src/test/resources/dataset/dataset.xml"));
	}

	@Test
	public void testRetrieveAll() {
		List<HelloWorld> results = helloWorldRepository.findAll();
		Assert.assertNotNull(results);
		Assert.assertEquals(2, results.size());
	}

}
