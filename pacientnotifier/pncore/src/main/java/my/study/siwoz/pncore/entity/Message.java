package my.study.siwoz.pncore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import my.study.siwoz.pncore.entity.enums.Media;

@Entity
public class Message extends BaseEntity {

	private static final long serialVersionUID = -5505549167535359743L;

	@Column(nullable = false)
	private String messageFrom;

	@Column(nullable = false)
	private String messageTo;

	private String title;

	@Column(nullable = false, length = 1024)
	private String text;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Media media;

	public String getFrom() {
		return messageFrom;
	}

	public Media getMedia() {
		return media;
	}

	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}

	public String getTo() {
		return messageTo;
	}

	public void setFrom(String from) {
		this.messageFrom = from;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTo(String to) {
		this.messageTo = to;
	}
}
