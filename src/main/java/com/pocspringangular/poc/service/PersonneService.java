package com.pocspringangular.poc.service;

import com.pocspringangular.poc.model.Personne;

import java.util.List;

public interface PersonneService {

    Personne create (Personne personne);

    List<Personne> read ();

    Personne update (Long Id, Personne personne);

    String delete (Long Id);

}
