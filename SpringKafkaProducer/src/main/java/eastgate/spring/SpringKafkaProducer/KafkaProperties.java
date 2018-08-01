package eastgate.spring.SpringKafkaProducer;

import java.util.Properties;

public class KafkaProperties {
	private Properties props;

	public KafkaProperties() {
		props = new Properties();
	}

	public void setKafkaConfig() {
		props.put("bootstrap.servers", "localhost:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	}

	public Properties getKafkaConfig() {
		return this.props;
	}
}
