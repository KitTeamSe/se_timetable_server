package com.se.timetableserver.v1.common.domain.exception;

public class SeException extends Exception{

  // HTTP error code
  private final int errorCode;

  public SeException(final int errorCode, final String msg, final Throwable cause){
    super(msg, cause);
    this.errorCode = errorCode;
  }

  public SeException(final int errorCode, final String msg){
    super(msg);
    this.errorCode = errorCode;
  }

  public int getErrorCode() {
    return errorCode;
  }
}
