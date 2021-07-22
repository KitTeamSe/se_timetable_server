package com.se.timetableserver.v1.timetable.domain.repository;

import com.se.timetableserver.v1.timetable.domain.model.TimeTable;
import java.util.Optional;

public interface TimeTableRepositoryProxy {

  Optional<TimeTable> findById(Long timeTableId);

  Optional<TimeTable> findByName(String name);


  TimeTable save(TimeTable timeTable);
}
