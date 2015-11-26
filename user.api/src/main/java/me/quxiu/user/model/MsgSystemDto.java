package me.quxiu.user.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MsgSystemDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -43673898558200906L;

	private long id;
	private String title;
	private String content;
	private String user_ids;
	private Date end_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser_ids() {
		return user_ids;
	}

	public void setUser_ids(String user_ids) {
		this.user_ids = user_ids;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	

}
