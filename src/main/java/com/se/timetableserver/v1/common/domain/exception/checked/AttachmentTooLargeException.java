package com.se.timetableserver.v1.common.domain.exception.checked;

/**
 * 사용자가 제한 크기를 초과한 파일을 첨부하려 하는 경우의 예외.
 */
public class AttachmentTooLargeException extends SaveAttachmentException {

  public AttachmentTooLargeException() {
    super();
  }

  public AttachmentTooLargeException(String message) {
    super(message);
  }

  public AttachmentTooLargeException(String message, Throwable cause) {
    super(message, cause);
  }

  public AttachmentTooLargeException(Throwable cause) {
    super(cause);
  }
}
