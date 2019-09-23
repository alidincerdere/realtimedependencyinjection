package com.realtimedependencyinjection.trial.service.impl;

import com.realtimedependencyinjection.trial.service.MyService;
import org.springframework.stereotype.Component;



@Component(value = "ServiceA")
public class ServiceA implements MyService {

    @Override
    public String serve() {
        return "Served by Service A";
    }
}
