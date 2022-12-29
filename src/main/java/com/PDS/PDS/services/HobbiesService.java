
package com.PDS.PDS.services;

import com.PDS.PDS.models.HobbiesModel;
import com.PDS.PDS.repository.HobbiesRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService {
    
    
    @Autowired
    HobbiesRepository hobbiesRepository;
    
     //metodo que trae la lista de hobbies
    public ArrayList<HobbiesModel> obtenerHobbies(){ 
        return (ArrayList<HobbiesModel>)hobbiesRepository.findAll(); 
        
    }
    
    //metodo para actualizar el hobbies, pasando el Id en el Json
    //metodo que permite agregar la hobbies si no pasamos un Id en el Json
    public HobbiesModel guardarHobbies(HobbiesModel hobbies){ // repositorio de guardar usuario
        return hobbiesRepository.save(hobbies);
    }
    
    //metodo para eliminar el hobbies pasando el Id education/1
    public boolean eliminarHobbies(int id){ 
        try {
            hobbiesRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
