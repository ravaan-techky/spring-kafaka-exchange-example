package com.ravaan.techky.kafaka.exchange.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

/**
 * The Class KafkaTopicConfiguration.
 */
public class KafkaTopicConfiguration {

	/** The kafka topic name. */
	@Value("${kafka.topic.name}")
	private String kafkaTopicName;

	/**
	 * Kafka topic.
	 *
	 * @return the new topic
	 */
	@Bean
	public NewTopic kafkaTopic() {
		return TopicBuilder.name(kafkaTopicName).build();
	}
}
