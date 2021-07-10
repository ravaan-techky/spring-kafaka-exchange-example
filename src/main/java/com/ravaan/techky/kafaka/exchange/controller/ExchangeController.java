package com.ravaan.techky.kafaka.exchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravaan.techky.kafaka.exchange.consumer.ConsumerService;
import com.ravaan.techky.kafaka.exchange.producer.ProducerService;

// TODO: Auto-generated Javadoc
/**
 * The Class ExchangeController.
 */
@RestController
public class ExchangeController {

	/** The producer service. */
	@Autowired
	private ProducerService producerService;

	/** The consumer service. */
	@Autowired
	private ConsumerService consumerService;

	/**
	 * Produce message.
	 *
	 * @param message the message
	 */
	@GetMapping("/produceMessage")
	public void produceMessage(@RequestParam(name = "message") String message) {
		this.producerService.sendMessage(message);
	}

	/**
	 * Gets the all message.
	 *
	 * @return the all message
	 */
	@GetMapping("/message")
	public List<String> getAllMessage() {
		return this.consumerService.getAllMessage();
	}
}
