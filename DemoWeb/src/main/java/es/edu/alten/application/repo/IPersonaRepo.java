package es.edu.alten.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.edu.alten.application.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
