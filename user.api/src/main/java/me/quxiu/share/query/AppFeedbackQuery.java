package me.quxiu.share.query;

import java.io.Serializable;
import java.util.Date;

public class AppFeedbackQuery extends BaseQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -986271199136407512L;
	
	private Long id;
	private String contact;
	private Date start_feedback_time;
	private Date end_feedback_time;
	private String question;
	private Integer status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getStart_feedback_time() {
		return start_feedback_time;
	}
	public void setStart_feedback_time(Date start_feedback_time) {
		this.start_feedback_time = start_feedback_time;
	}
	public Date getEnd_feedback_time() {
		return end_feedback_time;
	}
	public void setEnd_feedback_time(Date end_feedback_time) {
		this.end_feedback_time = end_feedback_time;
	}
	
	
	
	

}
