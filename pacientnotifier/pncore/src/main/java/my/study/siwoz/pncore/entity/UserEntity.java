package my.study.siwoz.pncore.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class UserEntity extends Person {
	private static final long serialVersionUID = 2376529753833604336L;

	@OneToMany(mappedBy = "doctor")
	private List<Patient> patients;

	@Column(nullable = false)
	private String password;
	private String password2;
	@Column(nullable = false)
	private boolean passwordEncoded;

	public String getPassword() {
		return password;
	}

	public String getPassword2() {
		return password2;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public boolean isPasswordEncoded() {
		return passwordEncoded;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setPasswordEncoded(boolean passwordEncoded) {
		this.passwordEncoded = passwordEncoded;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
}
