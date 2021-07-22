package com.se.timetableserver.v1.common.domain.exception.checked;

/**
 * 반드시 예외 처리 해야 하고, rollback이 불가능한 예외를 위한 base class.
 */
public class SeCheckedException extends Exception {

  public SeCheckedException() {
    super();
  }

  public SeCheckedException(String message) {
    super(message);
  }

  public SeCheckedException(String message, Throwable cause) {
    super(message, cause);
  }

  public SeCheckedException(Throwable cause) {
    super(cause);
  }
}
