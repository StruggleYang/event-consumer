package com.today.event.consumer;

import com.github.dapeng.user.scala.events.ActivedEvent;
import com.github.dapeng.user.scala.events.BlackedEvent;
import com.github.dapeng.user.scala.events.RegisteredEvent;
import com.today.eventbus.annotation.KafkaListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author with struy.
 * Create by 2018/3/3 20:39
 * email :yq1724555319@gmail.com
 */
@KafkaListener(groupId = "eventConsumer", topic = "user_1.0.0_event",kafkaHostKey="kafka.consumer.host")
public class EventConsumer {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    @KafkaListener(serializer = "com.github.dapeng.user.scala.events.serializer.RegisteredEventSerializer")
    public void subscribeRegisteredEvent(RegisteredEvent event){
        LOGGER.info("Subscribed RegisteredEvent ==> {}",event.toString());
    }

    @KafkaListener(serializer = "com.github.dapeng.user.scala.events.serializer.ActivedEventSerializer")
    public void subscribeActivedEvent(ActivedEvent event){
        LOGGER.info("Subscribed RegisteredEvent ==> {}",event.toString());
    }

    @KafkaListener(serializer = "com.github.dapeng.user.scala.events.serializer.BlackedEventSerializer")
    public void subscribeBlackedEvent(BlackedEvent event){
        LOGGER.info("Subscribed RegisteredEvent ==> {}",event.toString());
    }
}
