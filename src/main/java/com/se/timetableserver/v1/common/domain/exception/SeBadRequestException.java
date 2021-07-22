package com.se.timetableserver.v1.common.domain.exception;

import java.net.HttpURLConnection;

public class SeBadRequestException extends SeException{

  public SeBadRequestException(String msg, Throwable cause) {
    super(HttpURLConnection.HTTP_BAD_REQUEST, msg, cause);
  }

  public SeBadRequestException(String msg) {
    super(HttpURLConnection.HTTP_BAD_REQUEST, msg);
  }
}
