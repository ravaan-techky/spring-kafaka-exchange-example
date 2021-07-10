package com.ravaan.techky.kafaka.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafakaExchangeExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafakaExchangeExampleApplication.class, args);
	}

}
