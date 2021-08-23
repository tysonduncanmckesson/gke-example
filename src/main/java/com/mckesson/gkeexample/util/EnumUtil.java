package com.mckesson.gkeexample.util;

import java.util.EnumSet;
import java.util.Optional;


public class EnumUtil {

  public static <T extends Enum<T>> Optional<T> valueOfByString(Class<T> clazz, String name) {
    return EnumSet.allOf(clazz).stream().filter(v -> v.name().equals(name)).findAny();
  }

  public static <T extends Enum<T>> Optional<T> valueOfByStringCaseInsensitive(Class<T> clazz, String name) {
    return valueOfByString(clazz, name.toUpperCase());
  }

}
