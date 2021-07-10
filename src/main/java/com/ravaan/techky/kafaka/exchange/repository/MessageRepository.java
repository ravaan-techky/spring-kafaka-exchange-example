package com.ravaan.techky.kafaka.exchange.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * The Class MessageRepository.
 */
@Component
public class MessageRepository {

	/** The messages. */
	private List<String> messages = new ArrayList<>();

	/**
	 * Adds the message.
	 *
	 * @param message the message
	 */
	public void addMessage(String message) {
		this.messages.add(message);
	}

	/**
	 * Gets the all message.
	 *
	 * @return the all message
	 */
	public List<String> getAllMessage() {
		return this.messages;
	}
}
