package me.tecuani.kafkaconsumer.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.config.TopicBuilder

@Configuration
@EnableKafka
class KafkaConfig(
        private val appProperties: AppProperties
) {

    @Bean
    fun demoTopic() = TopicBuilder
            .name(appProperties.topic)
            .partitions(appProperties.partitions)
            .replicas(appProperties.replicas)
            .build()

}
