package com.se.timetableserver.v1.common.domain.exception.checked;

/**
 * 메소드 호출시 전제조건이 충족되지 않은 경우의 예외.
 */
public class PreconditionFailedException extends SeCheckedException {

  public PreconditionFailedException() {
    super();
  }

  public PreconditionFailedException(String message) {
    super(message);
  }

  public PreconditionFailedException(String message, Throwable cause) {
    super(message, cause);
  }

  public PreconditionFailedException(Throwable cause) {
    super(cause);
  }
}
