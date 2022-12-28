
package com.PDS.PDS.services;

import com.PDS.PDS.models.ContactModel;
import com.PDS.PDS.repository.ContactRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    
    
    @Autowired
    ContactRepository contactRepository;
    
     //metodo que trae la lista de words
    public ArrayList<ContactModel> obtenerContact(){ 
        return (ArrayList<ContactModel>)contactRepository.findAll(); 
        
    }
    
    //metodo para actualizar el word, pasando el Id en el Json
    //metodo que permite agregar una education si no pasamos un Id en el Json
    public ContactModel guardarContact(ContactModel contact){ // repositorio de guardar usuario
        return contactRepository.save(contact);
    }
    
    //metodo para eliminar una education pasando el Id education/1
    public boolean eliminarContact(int id){ 
        try {
            contactRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
