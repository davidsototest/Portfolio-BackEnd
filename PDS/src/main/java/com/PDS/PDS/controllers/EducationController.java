
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.EducationModel;
import com.PDS.PDS.services.EducationService;
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
@RequestMapping("/education")
public class EducationController {
    
    @Autowired
    EducationService educationService;
    
    //metodo para obtener la lista de educaciones
    @GetMapping()
    public ArrayList<EducationModel> obtenerEducation(){
        return educationService.obtenerEducation();
    }
    
    //metodo para actualizar la educacion si paso el ID en el Json
    //metodo para agregar educacion si no paso un ID en el jSON
    @PostMapping()
    public EducationModel guardarUsuario(@RequestBody EducationModel education){
        return this.educationService.guardarEducation(education);
    }
    
    //metodo para eliminar la education pasando education/1 1=ID de la education
    @DeleteMapping ( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok = this.educationService.eliminarEducation(id);
        if (ok){
            return "se elimino la Educacion con id: " + id;
        } else{
            return "No pudo eliminar la Educacion con id: " + id;
        }
    }
    
}
