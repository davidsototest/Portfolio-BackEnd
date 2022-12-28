
package com.PDS.PDS.repository;

import com.PDS.PDS.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> { 
   //crudRepository trae todos los metodos para comunicar con la DB 
}
