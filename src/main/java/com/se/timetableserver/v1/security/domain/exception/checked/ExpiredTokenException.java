package com.se.timetableserver.v1.security.domain.exception.checked;

import com.se.timetableserver.v1.common.domain.exception.SeException;
import org.springframework.http.HttpStatus;

/**
 * 토큰이 만료된 경우 발생하는 예외.
 */
public class ExpiredTokenException extends SeException {

  public ExpiredTokenException(String message) {
    super(HttpStatus.UNAUTHORIZED, message);
  }

  public ExpiredTokenException(String message, Throwable cause) {
    super(HttpStatus.UNAUTHORIZED, message, cause);
  }

  public ExpiredTokenException(Throwable cause) {
    super(HttpStatus.UNAUTHORIZED, cause);
  }
}
