
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.ContactModel;
import com.PDS.PDS.services.ContactService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contact")
public class ContactController {
    
    @Autowired
    ContactService contactService;
    
    //metodo para obtener la lista de word
    @GetMapping()
    public ArrayList<ContactModel> obtenerContact(){
        return contactService.obtenerContact();
    }
    
    //metodo para actualizar el contact si paso el ID en el Json
    //metodo para agregar contact si no paso un ID en el jSON
    @PostMapping()
    public ContactModel guardarContact(@RequestBody ContactModel contact){
        return this.contactService.guardarContact(contact);
    }
      
}
