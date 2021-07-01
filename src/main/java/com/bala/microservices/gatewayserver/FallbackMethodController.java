package com.bala.microservices.gatewayserver;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FallbackMethodController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallback(){
        return "User Services is too longer than expected"
                +"Try Again Later!";
    }



    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallback(){
        return "User Services is too longer than expected"
                +"Try Again Later!";
    }
}
