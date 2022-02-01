package com.APEX.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class APEXMessages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Message")
	private String Message;
	
	@Column(name = "MessageType")
	private String MessageType;
	
	@Column(name = "ModifyDate")
	@Temporal(TemporalType.DATE)
	private Date ModifyDate;
	
	@Column(name = "ModifyTime")
	@Temporal(TemporalType.TIME)
	private Date ModifyTime;
	
	
	public APEXMessages() {
		super();
	}
	
	public APEXMessages(String message, String messageType, Date modifyDate, Date modifyTime) {
		super();
		Message = message;
		MessageType = messageType;
		ModifyDate = modifyDate;
		ModifyTime = modifyTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public Date getModifyDate() {
		return ModifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		ModifyDate = modifyDate;
	}
	public Date getModifyTime() {
		return ModifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		ModifyTime = modifyTime;
	}

	@Override
	public String toString() {
		return "APEXMessages [id=" + id + ", Message=" + Message + ", MessageType=" + MessageType + ", ModifyDate="
				+ ModifyDate + ", ModifyTime=" + ModifyTime + "]";
	}
	

}
