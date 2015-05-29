package my.study.siwoz.pnweb.interfaces.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import my.study.siwoz.pncore.entity.UserEntity;

@ManagedBean(name = "autenticationBean")
@SessionScoped
public class AutenticationBean implements Serializable {

	private static final long serialVersionUID = -1165206880559159407L;
	private UserEntity loggedUser;

	public UserEntity getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(UserEntity loggedUser) {
		this.loggedUser = loggedUser;
	}

}
