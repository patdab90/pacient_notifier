package my.study.siwoz.pncore.dao;

import java.io.Serializable;

import my.study.siwoz.pncore.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>,
		Serializable {
	public UserEntity findByEmail(String email);
}
