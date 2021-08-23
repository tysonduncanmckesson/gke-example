package com.mckesson.gkeexample.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import com.mckesson.gkeexample.service.GreetingService;
import com.mckesson.gkeexample.view.GreetingView;


@RestController
@RequestMapping("/greeting")
public class GreetingController extends AbstractBaseController {

  @Resource
  private GreetingService greetingService;


  @GetMapping
  public @ResponseBody
  List<GreetingView> getGreetings() {
    return orikaMapperFacade.mapAsList(greetingService.getGreetings(), GreetingView.class);
  }

  @GetMapping("/{greetingType}")
  public @ResponseBody GreetingView getGreetingByType(@PathVariable String greetingType) {
    return orikaMapperFacade.map(greetingService.getGreetingByType(greetingType), GreetingView.class);
  }
}
