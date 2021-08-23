package com.mckesson.gkeexample.service;

import java.util.List;

import com.mckesson.gkeexample.dto.Greeting;


public interface GreetingService {

  List<Greeting> getGreetings();

  Greeting getGreetingByType(String greetingType);

}
