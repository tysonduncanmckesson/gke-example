package com.mckesson.gkeexample.exception;

public abstract class AbstractBaseException extends RuntimeException {

  public AbstractBaseException() {
    super();
  }

  public AbstractBaseException(String message) {
    super(message);
  }

  public AbstractBaseException(String message, Throwable cause) {
    super(message, cause);
  }

  public AbstractBaseException(Throwable cause) {
    super(cause);
  }


}
