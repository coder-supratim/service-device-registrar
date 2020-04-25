package com.timsoft.deviceregistrar.config;


import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DeviceRegistrarServiceConfig {


    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }


    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
