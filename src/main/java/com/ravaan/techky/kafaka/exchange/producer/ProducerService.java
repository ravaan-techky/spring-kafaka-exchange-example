package com.ravaan.techky.kafaka.exchange.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * The Class ProducerService.
 */
@Component
public class ProducerService {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProducerService.class);
	
	/** The kafka template. */
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	/** The kafka topic name. */
	@Value("${kafka.topic.name}")
	private String kafkaTopicName;
	
	/**
	 * Send message.
	 *
	 * @param message the message
	 */
	public void sendMessage(String message) {
		LOGGER.info("SENDING MESSAGE => " +	 message);
		kafkaTemplate.send(kafkaTopicName, message);
	}
}
