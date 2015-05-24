/**
 *
 */
package my.study.siwoz.pncore.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class HelloWorld extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1556649955542134932L;

	/**
	 * Last name.
	 */
	private String lastName;

	/**
	 * First name.
	 */
	private String firstName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
