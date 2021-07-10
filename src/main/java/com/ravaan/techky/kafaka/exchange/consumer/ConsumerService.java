package com.ravaan.techky.kafaka.exchange.consumer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.ravaan.techky.kafaka.exchange.repository.MessageRepository;

/**
 * The Class ConsumerService.
 */
@Component
public class ConsumerService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);
	
	/** The message respository. */
	@Autowired
	MessageRepository messageRespository;
	
	/**
	 * Consume.
	 *
	 * @param message the message
	 */
	@KafkaListener(topics = "${kafka.topic.name}", groupId = "xyz")
	public void consume(String message) {
		LOGGER.info("MESSAGE RECEIVED => " + message);
		messageRespository.addMessage(message);
	}
	
	/**
	 * Gets the all message.
	 *
	 * @return the all message
	 */
	public List<String> getAllMessage(){
		return messageRespository.getAllMessage();
	}
}
