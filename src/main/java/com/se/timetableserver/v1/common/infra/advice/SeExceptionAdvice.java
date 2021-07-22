/*
 *
 *  Copyright 2021 KitTeamSe.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *  Original Code
 *  https://github.com/Netflix/genie/blob/master/genie-web/src/main/java/com/netflix/genie/web/apis/rest/v3/controllers/GenieExceptionMapper.java
 *  modified by dldhk97
 */

package com.se.timetableserver.v1.common.infra.advice;

import com.se.timetableserver.v1.common.domain.exception.SeException;
import com.se.timetableserver.v1.common.domain.exception.checked.AttachmentTooLargeException;
import com.se.timetableserver.v1.common.domain.exception.checked.IdAlreadyExistsException;
import com.se.timetableserver.v1.common.domain.exception.checked.NotFoundException;
import com.se.timetableserver.v1.common.domain.exception.checked.PreconditionFailedException;
import com.se.timetableserver.v1.common.domain.exception.checked.SeCheckedException;
import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//TODO : 에러 컨벤션 확보 필요
@RestControllerAdvice
public class SeExceptionAdvice {

  @ExceptionHandler(SeException.class)
  public ResponseEntity<SeException> handleSeException(final SeException e){
    // this.countExceptionAndLog(e);
    HttpStatus status = HttpStatus.resolve(e.getErrorCode());
    if(status == null)
      status = HttpStatus.INTERNAL_SERVER_ERROR;
    return new ResponseEntity<>(e, status);
  }

  @ExceptionHandler(SeCheckedException.class)
  public ResponseEntity<SeCheckedException> handleGenieCheckedException(final SeCheckedException e) {
    // this.countExceptionAndLog(e);
    if (e instanceof IdAlreadyExistsException) {
      return new ResponseEntity<>(e, HttpStatus.CONFLICT);
    } else if (e instanceof NotFoundException) {
      return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    } else if (e instanceof PreconditionFailedException) {
      return new ResponseEntity<>(e, HttpStatus.PRECONDITION_FAILED);
    } else if (e instanceof AttachmentTooLargeException) {
      return new ResponseEntity<>(e, HttpStatus.PAYLOAD_TOO_LARGE);
    } else {
      return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<PreconditionFailedException> handleConstraintViolation(final ConstraintViolationException e) {
    // this.countExceptionAndLog(e);
    return new ResponseEntity<>(
        new PreconditionFailedException(e.getMessage(), e),
        HttpStatus.PRECONDITION_FAILED
    );
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<PreconditionFailedException> handleMethodArgumentNotValidException(final MethodArgumentNotValidException e) {
    // this.countExceptionAndLog(e);
    return new ResponseEntity<>(
        new PreconditionFailedException(e.getMessage(), e),
        HttpStatus.PRECONDITION_FAILED
    );
  }

  // TODO: 로그 스택 구축 시 작성
  private void countExceptionAndLog(final Exception e) {
//    log.error("{}: {}", e.getClass().getSimpleName(), e.getLocalizedMessage());
//    log.debug("{}: {}", e.getClass().getCanonicalName(), e.getMessage(), e);
  }
}
