package com.trl.vertex_kafka.config;

import com.trl.vertex_kafka.constants.Constants.Kafka;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.HashMap;
import java.util.Map;


public class KafkaConfig {

  private static final String BOOTSTRAP_SERVERS = System.getenv().getOrDefault("bootstrap-servers", Kafka.DEFAULT_BOOTSTRAP_SERVERS);
  private static final String GROUP_ID = System.getenv().getOrDefault("group-id", Kafka.DEFAULT_GROUP_ID);
  private static final String SERIALIZER_CLASS_NAME = StringDeserializer.class.getName();
  private static final String DESERIALIZER_CLASS_NAME = StringDeserializer.class.getName();
  private static final String CLIENT_ID_CONFIG = "testProducerClientId";
  private static final String MAX_POLL_RECORDS_CONFIG = "1";
  private static final String ENABLE_AUTO_COMMIT_CONFIG = "false";

//  private static final String AUTO_OFFSET_RESET_CONFIG = "earliest";
  private static final String AUTO_OFFSET_RESET_CONFIG = "latest";

//  private static final String ACKS_CONFIG = "0";
//  private static final String ACKS_CONFIG = "1";
  private static final String ACKS_CONFIG = "all";


  public static Map<String, String> prepareProducerProperties() {
    Map<String, String> props = new HashMap<>();
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
    props.put(ProducerConfig.CLIENT_ID_CONFIG, CLIENT_ID_CONFIG);
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, SERIALIZER_CLASS_NAME);
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, SERIALIZER_CLASS_NAME);
//    props.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, CustomPartitioner.class.getName());
    props.put(ProducerConfig.ACKS_CONFIG, ACKS_CONFIG);

    return props;
  }

  public static Map<String, String> prepareConsumerProperties() {
    Map<String, String> props = new HashMap<>();
    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
    props.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, DESERIALIZER_CLASS_NAME);
    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, DESERIALIZER_CLASS_NAME);
    props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, MAX_POLL_RECORDS_CONFIG);
    props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, ENABLE_AUTO_COMMIT_CONFIG);
    props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, AUTO_OFFSET_RESET_CONFIG);

    return props;
  }

}
