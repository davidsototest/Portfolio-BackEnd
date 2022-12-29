
package com.PDS.PDS.repository;

import com.PDS.PDS.models.EducationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducationRepository extends CrudRepository<EducationModel, Integer> {
    
}
