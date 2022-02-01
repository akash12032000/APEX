package com.APEX.Service;

public interface MessageStoreServiceInterface {
	
	public void addMessage(int after_message_number_count);
	public void saveMessages(int MessageCount);

}
