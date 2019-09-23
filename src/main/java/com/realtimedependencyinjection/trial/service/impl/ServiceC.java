package com.realtimedependencyinjection.trial.service.impl;

import com.realtimedependencyinjection.trial.service.MyService;
import org.springframework.stereotype.Component;


@Component(value = "ServiceC")
public class ServiceC implements MyService {
    @Override
    public String serve() {
        return "Served by service C";
    }
}
