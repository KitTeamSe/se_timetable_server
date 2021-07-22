package com.se.timetableserver.v1.common.domain.exception.checked;

/**
 * 리소스를 찾지 못한 경우의 예외.
 */
public class NotFoundException extends SeCheckedException {

  public NotFoundException() {
    super();
  }

  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public NotFoundException(Throwable cause) {
    super(cause);
  }
}
