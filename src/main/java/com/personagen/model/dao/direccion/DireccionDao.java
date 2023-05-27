package com.personagen.model.dao.direccion;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.personagen.model.entity.direccion.Direccion;

public interface DireccionDao extends MongoRepository<Direccion, Long> {

	@Query("{ 'id' : ?0 }")
	Direccion buscarPorId(String id);
}
