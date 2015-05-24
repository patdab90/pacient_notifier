/**
 *
 */
package my.study.siwoz.pncore.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Hello entity.
 *
 * @author jeetemplates
 */
@Entity
public class HelloWorld implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1556649955542134932L;

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Last name.
	 */
	private String lastName;

	/**
	 * First name.
	 */
	private String firstName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
