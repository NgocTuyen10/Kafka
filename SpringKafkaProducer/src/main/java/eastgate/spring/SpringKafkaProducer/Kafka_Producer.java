package eastgate.spring.SpringKafkaProducer;

import java.util.Map;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Kafka_Producer {
	private KafkaProperties properties;
	private String mess;
	private String topic;
	private Producer<String, String> producer;
	private Properties props;

	public Kafka_Producer() {
		producer = new KafkaProducer<String, String>((Map<String, Object>) properties);
		properties.setKafkaConfig();
	}

	public void sendMess(String mess, String topic) {
		producer.send((new ProducerRecord<String, String>(topic, mess)));
	}
}
