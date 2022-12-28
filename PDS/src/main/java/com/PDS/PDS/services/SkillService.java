
package com.PDS.PDS.services;

import com.PDS.PDS.models.SkillModel;
import com.PDS.PDS.repository.SkillRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    
    @Autowired
    SkillRepository skillRepository;
    
     //metodo que trae la lista de words
    public ArrayList<SkillModel> obtenerSkill(){ 
        return (ArrayList<SkillModel>)skillRepository.findAll(); 
        
    }
    
    //metodo para actualizar el word, pasando el Id en el Json
    //metodo que permite agregar una education si no pasamos un Id en el Json
    public SkillModel guardarSkill(SkillModel skill){ // repositorio de guardar usuario
        return skillRepository.save(skill);
    }
    
    //metodo para eliminar una education pasando el Id education/1
    public boolean eliminarSkill(int id){ 
        try {
            skillRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
