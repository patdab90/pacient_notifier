package my.study.siwoz.pncore.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient extends Person {
	private static final long serialVersionUID = 8670400146219275346L;

	private String xmppId;
	@ManyToOne(optional = false)
	@JoinColumn
	private UserEntity doctor;
}
