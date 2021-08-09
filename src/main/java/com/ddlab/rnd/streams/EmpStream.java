package com.ddlab.rnd.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface EmpStream {
    String INPUT = "emp-in";

    @Input(INPUT)
    SubscribableChannel inBoundMsg();


}
