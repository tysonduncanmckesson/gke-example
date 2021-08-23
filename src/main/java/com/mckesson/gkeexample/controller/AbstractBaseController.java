package com.mckesson.gkeexample.controller;

import javax.annotation.Resource;

import ma.glasnost.orika.MapperFacade;


abstract public class AbstractBaseController {

  @Resource
  protected MapperFacade orikaMapperFacade;
}
