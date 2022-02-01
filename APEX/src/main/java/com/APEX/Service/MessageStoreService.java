package com.APEX.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.APEX.Model.APEXMessages;
import com.APEX.Repo.MessageRepo;

@Service
public class MessageStoreService implements MessageStoreServiceInterface{
	
	@Autowired
	private MessageRepo repo;
	
	
	@Autowired
	private Environment env;


	@Override
	public void addMessage(int after_message_number_count) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void saveMessages(int MessageCount) {
	
		for(int i=0;i<=MessageCount;i++) {
			APEXMessages messages = new APEXMessages();
			messages.setId(i);
			messages.setMessage(env.getProperty("Message"+i));
			messages.setMessageType("short");
			messages.setModifyDate(new Date());
			messages.setModifyTime(new Date());
			System.out.println(messages.toString());
			repo.save(messages);
		}
	}
	
	

}
