package my.study.siwoz.pnweb.interfaces.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import my.study.siwoz.pncore.entity.UserEntity;

@ManagedBean(name = "autenticationBean")
@SessionScoped
public class AutenticationBean {

	private UserEntity loggedUser;

	public UserEntity getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(UserEntity loggedUser) {
		this.loggedUser = loggedUser;
	}

}
