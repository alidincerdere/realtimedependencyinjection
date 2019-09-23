package com.realtimedependencyinjection.trial.controller;

import com.realtimedependencyinjection.trial.service.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adere on 23.09.2019.
 */

@RestController
public class HelloController {

    @Autowired
    private ServiceFactory serviceFactory;


    @GetMapping("/hello")
    public String hello() {

        return serviceFactory.getService().serve();
    }
}
