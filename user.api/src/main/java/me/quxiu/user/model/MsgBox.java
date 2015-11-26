package me.quxiu.user.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MsgBox implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4530685355566554804L;
	
	private Long id;
	private String title;
	private String content;
	private Long fromUserId;
	private Long toUserId;
	private Date createTime;
	private Integer isRead;
	private Integer isDelete;
	private Long systemMsgId;
	private Integer type;
	private String groupKey;
	private Integer isNotice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Long getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(Long fromUserId) {
		this.fromUserId = fromUserId;
	}
	public Long getToUserId() {
		return toUserId;
	}
	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getIsRead() {
		return isRead;
	}
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Long getSystemMsgId() {
		return systemMsgId;
	}
	public void setSystemMsgId(Long systemMsgId) {
		this.systemMsgId = systemMsgId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getGroupKey() {
		return groupKey;
	}
	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}
	public Integer getIsNotice() {
		return isNotice;
	}
	public void setIsNotice(Integer isNotice) {
		this.isNotice = isNotice;
	}
	
	

}
