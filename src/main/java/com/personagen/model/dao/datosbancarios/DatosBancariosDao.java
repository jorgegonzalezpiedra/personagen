package com.personagen.model.dao.datosbancarios;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.personagen.model.entity.datosbancarios.DatosBancarios;

public interface DatosBancariosDao extends MongoRepository<DatosBancarios, Long> {

	@Query("{ 'id' : ?0 }")
	DatosBancarios buscarPorId(String id);
}
