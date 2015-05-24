package my.study.siwoz.pnweb.domain;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jeetemplates
 */
public interface HelloWorldRepository extends JpaRepository<HelloWorld, Serializable> {

}
