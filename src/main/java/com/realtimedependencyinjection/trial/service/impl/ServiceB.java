package com.realtimedependencyinjection.trial.service.impl;

import com.realtimedependencyinjection.trial.service.MyService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component(value = "ServiceB")
public class ServiceB implements MyService {

    @Override
    public String serve() {
        return "Served by Service B";
    }
}
