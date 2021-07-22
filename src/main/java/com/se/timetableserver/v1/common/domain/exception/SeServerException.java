package com.se.timetableserver.v1.common.domain.exception;

import java.net.HttpURLConnection;

/**
 * Exception for all internal server failures.
 */
public class SeServerException extends SeException {

  public SeServerException(String msg, Throwable cause) {
    super(HttpURLConnection.HTTP_INTERNAL_ERROR, msg, cause);
  }

  public SeServerException(String msg) {
    super(HttpURLConnection.HTTP_INTERNAL_ERROR, msg);
  }
}
