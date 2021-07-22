package com.se.timetableserver.v1.common.domain.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

public class AccountGenerateEntity extends BaseEntity{

  @CreatedBy
  private Long createdAccountBy;

  @LastModifiedBy
  private Long lastModifiedAccountBy;
}
