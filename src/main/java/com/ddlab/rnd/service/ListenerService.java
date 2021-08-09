package com.ddlab.rnd.service;

import com.ddlab.rnd.entity.Employee;
import com.ddlab.rnd.streams.EmpStream;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ListenerService {

    @StreamListener(EmpStream.INPUT)
    public void handleGreetings(@Payload Employee emp, @Headers Map<String, Object> headers) {
        System.out.println("Received greetings: "+emp);
        System.out.println("Partition: "+headers.get(KafkaHeaders.RECEIVED_PARTITION_ID));
        System.out.println("Offset: "+headers.get(KafkaHeaders.OFFSET));
        System.out.println("Emp Name : "+emp.getName());
        System.out.println("Emp Id: "+emp.getId());
    }
}
