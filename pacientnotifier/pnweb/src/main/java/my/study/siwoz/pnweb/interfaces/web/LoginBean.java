package my.study.siwoz.pnweb.interfaces.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import my.study.siwoz.pncore.entity.UserEntity;
import my.study.siwoz.pncore.service.LogInService;

@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 6471254769085507689L;

	@ManagedProperty("#{loginService}")
	private LogInService logInService;

	@ManagedProperty("#{autenticationBean}")
	private AutenticationBean autenticationBean;

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	public void login() {
		UserEntity user = logInService.login(email, password);
		if (user != null) {
			autenticationBean.setLoggedUser(user);
		}
	}
}
