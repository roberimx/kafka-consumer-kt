package me.tecuani.kafkaconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class KafkaConsumerApplication

fun main(args: Array<String>) {
    runApplication<KafkaConsumerApplication>(*args)
}
