package com.se.timetableserver.v1.timetable.adapter.controller;

import com.se.timetableserver.v1.common.application.dto.SuccessResponse;
import com.se.timetableserver.v1.timetable.application.dto.TimeTableCreateDto;
import com.se.timetableserver.v1.timetable.application.service.TimeTableCreateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@Api(tags = "시간표 관리")
public class TimeTableApiController {

  private final TimeTableCreateService timeTableCreateService;
//  private final TimeTableReadService timeTableReadService;
//  private final TimeTableUpdateService timeTableUpdateService;
//  private final TimeTableDeleteService timeTableDeleteService;

  @Autowired
  public TimeTableApiController(TimeTableCreateService timeTableCreateService) {
    this.timeTableCreateService = timeTableCreateService;
  }

//  @Autowired
//  public TimeTableApiController(TimeTableCreateService timeTableCreateService,
//      TimeTableReadService timeTableReadService, TimeTableUpdateService timeTableUpdateService,
//      TimeTableDeleteService timeTableDeleteService) {
//    this.timeTableCreateService = timeTableCreateService;
//    this.timeTableReadService = timeTableReadService;
//    this.timeTableUpdateService = timeTableUpdateService;
//    this.timeTableDeleteService = timeTableDeleteService;
//  }

  @PostMapping(path = "/timetable")
  @ResponseStatus(value = HttpStatus.CREATED)
  @ApiOperation(value = "시간표 추가")
  public SuccessResponse<Long> create(@RequestBody @Validated TimeTableCreateDto.Request request) {
    return new SuccessResponse<>(HttpStatus.CREATED.value(), "시간표 생성에 성공했습니다.", timeTableCreateService.create(request));
  }

//  @GetMapping(path = "/timetable/{id}")
//  @ApiOperation("시간표 조회")
//  @ResponseStatus(value = HttpStatus.OK)
//  public SuccessResponse<TimeTableReadDto.Response> read(@PathVariable(value = "id") Long id){
//    return new SuccessResponse<>(HttpStatus.OK.value(), "성공적으로 조회되었습니다.", timeTableReadService.read(id));
//  }
//
//  @GetMapping(path = "/timetables")
//  @ApiOperation("시간표 전체 조회")
//  @ResponseStatus(value = HttpStatus.OK)
//  public SuccessResponse<PageImpl<Response>> readAll(@Validated PageRequest pageRequest){
//    return new SuccessResponse<>(HttpStatus.OK.value(), "성공적으로 조회되었습니다.", timeTableReadService.readAll(pageRequest.of()));
//  }
//
//  @PutMapping(path = "/timetable/{id}")
//  @ResponseStatus(value = HttpStatus.OK)
//  @ApiOperation(value = "시간표 수정")
//  public SuccessResponse<Long> update(@RequestBody @Validated TimeTableUpdateDto.Request request){
//
//    return new SuccessResponse<>(HttpStatus.OK.value(), "시간표 수정에 성공했습니다.", timeTableUpdateService.update(request));
//  }
//
//  @DeleteMapping(path = "/timetable/{id}")
//  @ResponseStatus(value = HttpStatus.OK)
//  @ApiOperation(value = "시간표 삭제")
//  public SuccessResponse delete(@PathVariable(value = "id") Long id){
//    timeTableDeleteService.delete(id);
//    return new SuccessResponse<>(HttpStatus.OK.value(), "시간표 삭제에 성공했습니다.");
//  }
}
