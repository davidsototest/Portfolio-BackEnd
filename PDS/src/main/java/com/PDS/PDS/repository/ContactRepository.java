
package com.PDS.PDS.repository;

import com.PDS.PDS.models.ContactModel;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<ContactModel, Integer>{
    
}
