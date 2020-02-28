package me.tecuani.kafkaconsumer.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("me.tecuani.kafkaconsumer")
data class AppProperties(
        var topic: String = "me.tecuani.demo.kafka.topic",
        var group: String = "me.tecuani.demo.kafka.group",
        var partitions: Int = 2,
        var replicas: Int = 1
)
