package com.se.timetableserver.v1.timetable.infra.repository;

import com.se.timetableserver.v1.timetable.domain.model.TimeTable;
import com.se.timetableserver.v1.timetable.domain.repository.TimeTableRepositoryProxy;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableJpaRepository extends JpaRepository<TimeTable, Long>, TimeTableRepositoryProxy {

  @Override
  Optional<TimeTable> findById(Long timeTableId);

  Optional<TimeTable> findByName(String name);
}
