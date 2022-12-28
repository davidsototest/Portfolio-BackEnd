
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.ProjectModel;
import com.PDS.PDS.services.ProjectService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
    
    @Autowired
    ProjectService projectService;
    
    //metodo para obtener la lista de word
    @GetMapping()
    public ArrayList<ProjectModel> obtenerProject(){
        return projectService.obtenerProject();
    }
    
    //metodo para actualizar la word si paso el ID en el Json
    //metodo para agregar word si no paso un ID en el jSON
    @PostMapping()
    public ProjectModel guardarProject(@RequestBody ProjectModel project){
        return this.projectService.guardarProject(project);
    }
    
    //metodo para eliminar word pasando word/1 1=ID del word
    @DeleteMapping ( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok = this.projectService.eliminarProject(id);
        if (ok){
            return "se elimino el Proyecto con id: " + id;
        } else{
            return "No pudo eliminar el Proyecto con id: " + id;
        }
    }
    
}
