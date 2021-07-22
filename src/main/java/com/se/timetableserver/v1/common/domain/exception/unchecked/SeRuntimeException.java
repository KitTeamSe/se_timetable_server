package com.se.timetableserver.v1.common.domain.exception.unchecked;

/**
 * 예외 처리 하지 않아도 되는, rollback이 가능한 예외를 위한 base class.
 */
public class SeRuntimeException extends RuntimeException {

  public SeRuntimeException() {
    super();
  }

  public SeRuntimeException(String message) {
    super(message);
  }

  public SeRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public SeRuntimeException(Throwable cause) {
    super(cause);
  }
}
