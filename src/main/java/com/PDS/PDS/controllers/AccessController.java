
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.AccessModel;
import com.PDS.PDS.services.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/access")
public class AccessController {
    
    @Autowired
    AccessService accessService;
    
    //metodo para login
    @PostMapping()
    public boolean obtenerAccess(@RequestBody AccessModel access){
        return this.accessService.obtenerAccess(access);
    }
    
    
   
    
}
