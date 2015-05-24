package my.study.siwoz.pncore.dao;

import java.io.Serializable;

import my.study.siwoz.pncore.entity.HelloWorld;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jeetemplates
 */
public interface HelloWorldRepository extends
		JpaRepository<HelloWorld, Serializable> {

}
