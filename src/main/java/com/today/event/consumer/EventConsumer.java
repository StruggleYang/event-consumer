package com.today.event.consumer;

import com.github.dapeng.user.scala.events.ActivedEvent;
import com.github.dapeng.user.scala.events.BlackedEvent;
import com.github.dapeng.user.scala.events.RegisteredEvent;
import com.github.dapeng.user.scala.events.serializer.ActivedEventSerializer;
import com.github.dapeng.user.scala.events.serializer.BlackedEventSerializer;
import com.github.dapeng.user.scala.events.serializer.RegisteredEventSerializer;
import com.today.eventbus.annotation.KafkaConsumer;
import com.today.eventbus.annotation.KafkaListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author with struy.
 * Create by 2018/3/3 20:39
 * email :yq1724555319@gmail.com
 */
@KafkaConsumer(groupId = "eventConsumer1", topic = "user_1.0.0_event")
public class EventConsumer {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @KafkaListener(serializer = RegisteredEventSerializer.class)
    public void subscribeRegisteredEvent(RegisteredEvent event) {
        LOGGER.info("subscribeRegisteredEvent方法=========> 订阅到了消息 RegisteredEvent ==> {}", event.toString());
    }

    @KafkaListener(serializer = ActivedEventSerializer.class)
    public void subscribeActivedEvent(ActivedEvent event) {
        LOGGER.info("subscribeActivedEvent方法=========> 订阅到了消息  RegisteredEvent ==> {}", event.toString());
    }

    @KafkaListener(serializer = BlackedEventSerializer.class)
    public void subscribeBlackedEvent(BlackedEvent event) {
        LOGGER.info("subscribeBlackedEvent方法=========> 订阅到了消息  RegisteredEvent ==> {}", event.toString());
    }
}
