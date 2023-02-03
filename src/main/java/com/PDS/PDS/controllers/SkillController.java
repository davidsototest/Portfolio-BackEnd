
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.SkillModel;
import com.PDS.PDS.services.SkillService;
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
@RequestMapping("/skill")
public class SkillController {
    
    @Autowired
    SkillService skillService;
    
    //metodo para obtener la lista de word
    @GetMapping()
    public ArrayList<SkillModel> obtenerWord(){
        return skillService.obtenerSkill();
    }
    
    //metodo para actualizar la word si paso el ID en el Json
    //metodo para agregar word si no paso un ID en el jSON
    @PostMapping()
    public SkillModel guardarSkill(@RequestBody SkillModel skill){
        return this.skillService.guardarSkill(skill);
    }
    
    //metodo para eliminar word pasando word/1 1=ID del word
    @DeleteMapping ( path = "/{id}")
    public void eliminarPorId(@PathVariable("id") int id){
        this.skillService.eliminarSkill(id);        
    }
    
}
