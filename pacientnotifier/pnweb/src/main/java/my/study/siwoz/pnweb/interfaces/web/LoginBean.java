package my.study.siwoz.pnweb.interfaces.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import my.study.siwoz.pncore.adnotation.Loggable;
import my.study.siwoz.pncore.entity.UserEntity;
import my.study.siwoz.pncore.service.LoginService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 6471254769085507689L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(LoginBean.class);

	@ManagedProperty("#{loginService}")
	private LoginService logInService;

	@ManagedProperty("#{autenticationBean}")
	private AutenticationBean autenticationBean;

	private String email;

	private String password;

	public AutenticationBean getAutenticationBean() {
		return autenticationBean;
	}

	public String getEmail() {
		return email;
	}

	public LoginService getLogInService() {
		return logInService;
	}

	public String getPassword() {
		return password;
	}

	@Loggable
	public void login() {
		UserEntity user = logInService.login(email, password);
		if (user != null) {
			LOGGER.debug("login success!. email={}", email);
			autenticationBean.setLoggedUser(user);
		} else {
			LOGGER.debug("login faild!. email={}", email);
		}
	}

	public void logout() {
		autenticationBean.setLoggedUser(null);
	}

	public void setAutenticationBean(AutenticationBean autenticationBean) {
		this.autenticationBean = autenticationBean;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogInService(LoginService logInService) {
		this.logInService = logInService;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
