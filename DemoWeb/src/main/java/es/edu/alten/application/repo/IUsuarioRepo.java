package es.edu.alten.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.edu.alten.application.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String username);

}
