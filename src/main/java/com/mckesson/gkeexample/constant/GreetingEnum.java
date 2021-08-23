package com.mckesson.gkeexample.constant;

import java.util.EnumSet;
import java.util.Optional;

import lombok.Getter;


@Getter
public enum GreetingEnum {

  COWBOY("Howdy!"),
  NAUTICAL("Ahoy!"),
  ENGLISH ("Hello"),
  RUSSIAN("Привет"),
  DEFAULT("1 + 1 = 10");

  private String greeting;

  GreetingEnum(String greeting) {
    this.greeting = greeting;
  }

}
