package com.se.timetableserver.v1.timetable.application.service;

import com.se.timetableserver.v1.common.domain.exception.UniqueValueAlreadyExistsException;
import com.se.timetableserver.v1.timetable.application.dto.TimeTableCreateDto;
import com.se.timetableserver.v1.timetable.domain.model.TimeTable;
import com.se.timetableserver.v1.timetable.domain.model.TimeTableStatus;
import com.se.timetableserver.v1.timetable.domain.repository.TimeTableRepositoryProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TimeTableCreateService {

  private final TimeTableRepositoryProxy timeTableRepository;

  @Autowired
  public TimeTableCreateService(TimeTableRepositoryProxy timeTableRepository) {
    this.timeTableRepository = timeTableRepository;
  }

  @Transactional
  public Long create(TimeTableCreateDto.Request request){
    if(timeTableRepository.findByName(request.getName()).isPresent()){
      throw new UniqueValueAlreadyExistsException("Time table's name " + request.getName() + " already exists.");
    }

    TimeTable timeTable = new TimeTable(
        request.getName(),
        request.getYear(),
        request.getSemester(),
        TimeTableStatus.CREATED);

    timeTableRepository.save(timeTable);

    return timeTable.getTimeTableId();
  }
}
