package com.se.timetableserver.v1.common.domain.exception.checked;

/**
 * 리소스가 시스템에 이미 존재하는 ID로 저장되는 경우의 예외.
 */
public class IdAlreadyExistsException extends SeCheckedException {

  public IdAlreadyExistsException() {
    super();
  }

  public IdAlreadyExistsException(String message) {
    super(message);
  }

  public IdAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public IdAlreadyExistsException(Throwable cause) {
    super(cause);
  }
}
