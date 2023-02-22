package com.pocspringangular.poc.repository;

import com.pocspringangular.poc.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {


}
