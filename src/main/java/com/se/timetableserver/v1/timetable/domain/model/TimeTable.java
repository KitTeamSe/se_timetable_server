package com.se.timetableserver.v1.timetable.domain.model;

import com.se.timetableserver.v1.common.domain.model.AccountGenerateEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.ValidationException;
import javax.validation.constraints.Size;

@Entity
public class TimeTable extends AccountGenerateEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long timeTableId;

  @Size(min = 1, max = 50)
  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Integer year;

  @Column(nullable = false)
  private Integer semester;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private TimeTableStatus status;

  protected TimeTable() {
  }

  public TimeTable(@Size(min = 1, max = 50) String name, Integer year, Integer semester, TimeTableStatus status) {
    validateYear(year);
    validateSemester(semester);

    this.name = name;
    this.year = year;
    this.semester = semester;
    this.status = status;
  }

  private void validateYear(Integer year){
    if(year <= 1900)
      throw new ValidationException("Invalid year.");
  }

  private void validateSemester(Integer semester){
    if(semester < 0)
      throw new ValidationException("Invalid semester.");
  }

  public void updateName(String name){
    this.name = name;
  }

  public void updateYear(Integer year){
    validateYear(year);
    this.year = year;
  }

  public void updateSemester(Integer semester){
    validateSemester(semester);
    this.semester = semester;
  }

  public void updateStatus(TimeTableStatus status){
    this.status = status;
  }

  public Long getTimeTableId() {
    return timeTableId;
  }

  public String getName() {
    return name;
  }

  public Integer getYear() {
    return year;
  }

  public Integer getSemester() {
    return semester;
  }

  public TimeTableStatus getStatus() {
    return status;
  }
}
