
package com.PDS.PDS.repository;

import com.PDS.PDS.models.WordModel;
import org.springframework.data.repository.CrudRepository;


public interface WordRepository extends CrudRepository<WordModel, Integer> {
    
}
