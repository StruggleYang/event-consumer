package com.today.event.consumer;

import com.github.dapeng.user.scala.events.ActivedEvent;
import com.github.dapeng.user.scala.events.BlackedEvent;
import com.github.dapeng.user.scala.events.RegisteredEvent;
import com.today.eventbus.KafkaListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author with struy.
 * Create by 2018/3/3 20:39
 * email :yq1724555319@gmail.com
 */

public class EventConsumer {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @KafkaListener(groupId = "eventConsumer", topic = "user_1.0.0_event",
            serializer = "com.github.dapeng.user.scala.events.serializer.RegisteredEventSerializer")
    public void subscribeRegisteredEvent(RegisteredEvent event){
        LOGGER.info("Subscribed RegisteredEvent ==> {}",event.toString());
    }

    @KafkaListener(groupId = "eventConsumer", topic = "user_1.0.0_event",
            serializer = "com.github.dapeng.user.scala.events.serializer.ActivedEventSerializer")
    public void subscribeActivedEvent(ActivedEvent event){
        LOGGER.info("Subscribed RegisteredEvent ==> {}",event.toString());
    }

    @KafkaListener(groupId = "eventConsumer", topic = "user_1.0.0_event",
            serializer = "com.github.dapeng.user.scala.events.serializer.BlackedEventSerializer")
    public void subscribeBlackedEvent(BlackedEvent event){
        LOGGER.info("Subscribed RegisteredEvent ==> {}",event.toString());
    }
}
