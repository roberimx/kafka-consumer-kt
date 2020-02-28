package me.tecuani.kafkaconsumer.listener

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Kafka {

    private val log = LoggerFactory.getLogger(Kafka::class.java)

    @KafkaListener(
            topics = ["\${me.tecuani.kafkaconsumer.topic}"],
            groupId = "\${me.tecuani.kafkaconsumer.group}"
    )
    fun listen(content: String) {
        log.info(content)
    }

}
