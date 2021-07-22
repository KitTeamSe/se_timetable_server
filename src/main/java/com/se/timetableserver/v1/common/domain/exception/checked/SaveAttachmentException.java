package com.se.timetableserver.v1.common.domain.exception.checked;

/**
 * 시스템이 사용자의 첨부파일을 저장하려 할 때 어떠한 이유로 실패한 경우의 예외.
 */
public class SaveAttachmentException extends SeCheckedException {

  public SaveAttachmentException() {
    super();
  }

  public SaveAttachmentException(String message) {
    super(message);
  }

  public SaveAttachmentException(String message, Throwable cause) {
    super(message, cause);
  }

  public SaveAttachmentException(Throwable cause) {
    super(cause);
  }
}
