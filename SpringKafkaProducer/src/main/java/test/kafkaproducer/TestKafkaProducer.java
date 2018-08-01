package test.kafkaproducer;

import eastgate.spring.SpringKafkaProducer.Kafka_Producer;

public class TestKafkaProducer {

	public static void main(String[] args) {
		Kafka_Producer kafkaPro = new Kafka_Producer();
		kafkaPro.sendMess("Alo Alo ", "test");
	}
}
