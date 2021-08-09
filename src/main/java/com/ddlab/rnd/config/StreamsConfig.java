package com.ddlab.rnd.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.ddlab.rnd.streams.EmpStream;

@EnableBinding(EmpStream.class)
public class StreamsConfig {
    
}
