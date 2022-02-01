package com.APEX.Controller;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.APEX.Service.MessageStoreServiceInterface;

@RestController
@RequestMapping("/APEX")
public class APEXController {

	@Autowired
	private Environment env;
	
	@Autowired
	private MessageStoreServiceInterface messageSave;

	@GetMapping("/")
	public String CallingAPEX(@RequestParam("talk") String talk) {
		messageSave.saveMessages(5);
		StringBuilder message = new StringBuilder();
		Date date = new Date();
		Random random = new Random();
		int ran = random.nextInt(5);
		int hour = date.getHours();
		talk = talk.toLowerCase().trim();
		if (talk.contentEquals("apex")) {
			switch (ran) {
			case 1:
				if(hour > 4 && hour < 12) {
				message.append(env.getProperty("Message" + ran));
				}
				break;
			case 2:
				message.append(env.getProperty("Message" + ran));
				break;
			case 3:
				if(hour > 12 && hour < 17) {
				message.append(env.getProperty("Message" + ran));
				}
				break;
			case 4:
				if(hour > 17 && hour < 20) {
				message.append(env.getProperty("Message" + ran));
				}
				break;
			case 5:
				if(hour > 20) {
				message.append(env.getProperty("Message" + ran));
				}
				break;
			case 0:
				message.append(env.getProperty("Message" + ran));
				break;
			default:
				break;
			}
		}
		message.append("\n<br><br>"+env.getProperty("Positive_Message_Hind"+ran));
		return message.toString();
	}

}
