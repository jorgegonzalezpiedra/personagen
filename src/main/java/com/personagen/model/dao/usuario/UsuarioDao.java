package com.personagen.model.dao.usuario;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.personagen.model.entity.usuario.Usuario;

public interface UsuarioDao extends MongoRepository<Usuario, Long> {

	@Query("{ 'id' : ?0 }")
	Usuario buscarPorId(String id);
}
