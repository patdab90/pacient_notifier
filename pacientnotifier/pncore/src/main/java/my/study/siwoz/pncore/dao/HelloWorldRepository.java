package my.study.siwoz.pncore.dao;

import java.io.Serializable;

import my.study.siwoz.pncore.entity.HelloWorld;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends
		JpaRepository<HelloWorld, Serializable>, Serializable {

}
