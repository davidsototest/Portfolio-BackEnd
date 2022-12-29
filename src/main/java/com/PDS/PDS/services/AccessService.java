
package com.PDS.PDS.services;

import com.PDS.PDS.models.AccessModel;
import com.PDS.PDS.repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccessService {
    
    @Autowired
    AccessRepository accessRepository;
    
     //metodo que trae l
    public boolean obtenerAccess(AccessModel access){ 
            
        return accessRepository.equals(access);
        
        
    }
        
}
