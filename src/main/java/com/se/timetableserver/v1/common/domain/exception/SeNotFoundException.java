package com.se.timetableserver.v1.common.domain.exception;

import java.net.HttpURLConnection;

public class SeNotFoundException extends SeException{

  public SeNotFoundException(String msg, Throwable cause) {
    super(HttpURLConnection.HTTP_NOT_FOUND, msg, cause);
  }

  public SeNotFoundException(String msg) {
    super(HttpURLConnection.HTTP_NOT_FOUND, msg);
  }
}
