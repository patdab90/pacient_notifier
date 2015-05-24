package my.study.siwoz.pncore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5635029500213674168L;

	@Id
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, updatable = false)
	private Date created;

	@Temporal(TemporalType.DATE)
	@Column(name = "updated", nullable = false)
	private Date updated;

	public Date getCreated() {
		return created;
	}

	public Long getId() {
		return id;
	}

	public Date getUpdated() {
		return updated;
	}

	@PrePersist
	protected void onCreate() {
		updated = created = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updated = new Date();
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
