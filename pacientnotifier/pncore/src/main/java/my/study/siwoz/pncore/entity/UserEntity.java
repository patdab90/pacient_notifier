package my.study.siwoz.pncore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserEntity extends BaseEntity {
	private static final long serialVersionUID = 2376529753833604336L;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
