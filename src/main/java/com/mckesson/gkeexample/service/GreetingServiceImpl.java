package com.mckesson.gkeexample.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.mckesson.gkeexample.constant.GreetingEnum;
import com.mckesson.gkeexample.dto.Greeting;
import com.mckesson.gkeexample.util.EnumUtil;


@Service
public class GreetingServiceImpl implements GreetingService {

  @Override
  public List<Greeting> getGreetings() {

    return Stream.of(GreetingEnum.values()).map(g -> new Greeting(g.getGreeting())).collect(Collectors.toList());
  }

  @Override
  public Greeting getGreetingByType(String greetingType) {
    return new Greeting(
      EnumUtil.valueOfByStringCaseInsensitive(GreetingEnum.class, greetingType).orElse(GreetingEnum.DEFAULT).getGreeting());
  }
}
