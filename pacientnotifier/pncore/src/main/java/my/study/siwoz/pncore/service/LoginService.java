package my.study.siwoz.pncore.service;

import java.io.Serializable;

import javax.transaction.Transactional;

import my.study.siwoz.pncore.adnotation.Loggable;
import my.study.siwoz.pncore.dao.UserRepository;
import my.study.siwoz.pncore.entity.UserEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService implements Serializable {

	private static final long serialVersionUID = 4342866178895794739L;

	private Logger LOG = LoggerFactory.getLogger(LoginService.class);

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public UserEntity login(String login, String password) {
		UserEntity user = userRepository.findByEmail(login);
		if (user == null) {
			System.out.println("user not found.");
			return null;
		}
		System.out.printf("login=%s, pass=%s, log2=%s, pass=%s\n", login,
				password, user.getEmail(), user.getPassword());
		if (user.getPassword() != null) {
			if (user.isPasswordEncoded()) {
			} else {
				if (user.getPassword().equals(password)) {

					return user;
				}
			}
		}
		return null;
	}
}
