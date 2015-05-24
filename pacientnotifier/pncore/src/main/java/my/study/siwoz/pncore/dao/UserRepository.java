package my.study.siwoz.pncore.dao;

import my.study.siwoz.pncore.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
