
package com.PDS.PDS.services;

import com.PDS.PDS.models.EducationModel;
import com.PDS.PDS.repository.EducationRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {
    
    @Autowired
    EducationRepository educationRepository;
    
    //metodo que trae una lista de las educaciones cargadas
    public ArrayList<EducationModel> obtenerEducation(){ // metodo consultar lista educaciones
        return (ArrayList<EducationModel>)educationRepository.findAll();
    }
    
    //metodo para actualizar la educacion, pasando el Id en el Json
    //metodo que permite agregar una education si no pasamos un Id en el Json
    public EducationModel guardarEducation(EducationModel education){ // repositorio de guardar usuario
        return educationRepository.save(education);
    }
    
    //metodo para eliminar una education pasando el Id education/1
    public boolean eliminarEducation(int id){ 
        try {
            educationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
