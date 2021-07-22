package com.se.timetableserver.v1.timetable.application.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.Size;

public class TimeTableCreateDto {

  @ApiModel("시간표 생성 요청")
  static public class Request{
    @ApiModelProperty(notes = "이름", example = "테스트 시간표 1")
    @Size(min = 1, max = 50)
    private String name;

    @ApiModelProperty(notes = "년도", example = "2021")
    private Integer year;

    @ApiModelProperty(notes = "학기", example = "1")
    private Integer semester;

    public String getName() {
      return name;
    }

    public Integer getYear() {
      return year;
    }

    public Integer getSemester() {
      return semester;
    }
  }

}
