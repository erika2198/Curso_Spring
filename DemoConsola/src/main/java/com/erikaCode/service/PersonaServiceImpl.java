package com.erikaCode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.erikaCode.repository.IPersona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	@Qualifier("persona1")
	IPersona repo;
	@Override
	public void registrarHandler(String pNombre) {
		//repo = new PersonaRepoImpl();
		repo.registrar(pNombre);
	}


	

	

}
