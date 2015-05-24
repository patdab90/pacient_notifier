package my.study.siwoz.pncore.service;

import javax.transaction.Transactional;

import my.study.siwoz.pncore.dao.UserRepository;
import my.study.siwoz.pncore.entity.UserEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LogInService {

	private Logger LOG = LoggerFactory.getLogger(LogInService.class);

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public UserEntity login(String login, String password) {
		UserEntity user = userRepository.findByEmail(login);
		if (user == null) {
			return null;
		}
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
