package es.edu.alten.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.edu.alten.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
