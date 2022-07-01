package com.project.repository;

import com.project.model.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
