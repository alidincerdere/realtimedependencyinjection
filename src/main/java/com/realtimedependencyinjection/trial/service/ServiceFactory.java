package com.realtimedependencyinjection.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;

/**
 * Created by adere on 23.09.2019.
 */

@Service
public class ServiceFactory {


    @Value("${app.service.selector}")
    private String serviceSelector;

    @Autowired
    private ApplicationContext context;

    @Bean
    public MyService getService() {

        return (MyService)context.getBean(serviceSelector);
    }

}
