package com.pocspringangular.poc.repository;

import com.pocspringangular.poc.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository <Personne, Long> {


}
