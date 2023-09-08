package br.com.program.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.program.agenda.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}