package com.pocspringangular.poc.service;

import com.pocspringangular.poc.model.Person;

import java.util.List;

public interface PersonService {

    Person create (Person person);

    List<Person> read ();

    Person update (Long Id, Person person);

    String delete (Long Id);

}
