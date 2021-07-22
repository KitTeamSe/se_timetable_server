package com.se.timetableserver.v1.security.domain.exception.checked;

import com.se.timetableserver.v1.common.domain.exception.checked.SeCheckedException;

public class InvalidTokenException extends SeCheckedException {

  public InvalidTokenException() {
    super();
  }

  public InvalidTokenException(String message) {
    super(message);
  }

  public InvalidTokenException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidTokenException(Throwable cause) {
    super(cause);
  }
}
