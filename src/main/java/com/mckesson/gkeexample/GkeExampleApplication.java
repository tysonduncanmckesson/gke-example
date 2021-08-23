package com.mckesson.gkeexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.mckesson")
public class GkeExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(GkeExampleApplication.class, args);
  }

}
