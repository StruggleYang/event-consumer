package com.today.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author with struy.
 * Create by 2018/3/3 20:51
 * email :yq1724555319@gmail.com
 */

public class Bootstarp {
    private static final Logger LOGGER = LoggerFactory.getLogger(Bootstarp.class);

    public static void main(String[] args) throws IOException {

        System.setProperty("kafka.consumer.host","127.0.0.1:9092");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:springContext.xml" });
        context.start();
        LOGGER.info("Spring服务启动成功!");
        System.in.read();
    }
}
