
package com.PDS.PDS.services;

import com.PDS.PDS.models.ProjectModel;
import com.PDS.PDS.repository.ProjectRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    
    @Autowired
    ProjectRepository projectRepository;
    
    //metodo que trae la lista de projects
    public ArrayList<ProjectModel> obtenerProject(){ 
        return (ArrayList<ProjectModel>)projectRepository.findAll(); 
        
    }
    
    //metodo para actualizar el project, pasando el Id en el Json
    //metodo que permite agregar una project si no pasamos un Id en el Json
    public ProjectModel guardarProject(ProjectModel project){ // repositorio de guardar usuario
        return projectRepository.save(project);
    }
    
    //metodo para eliminar un project pasando el Id education/1
    public boolean eliminarProject(int id){ 
        try {
            projectRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
