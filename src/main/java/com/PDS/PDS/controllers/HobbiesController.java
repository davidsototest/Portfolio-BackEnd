
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.HobbiesModel;
import com.PDS.PDS.services.HobbiesService;
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
@RequestMapping("/hobbies")
public class HobbiesController {
    
    @Autowired
    HobbiesService hobbiesService;
    
    //metodo para obtener la lista de word
    @GetMapping()
    public ArrayList<HobbiesModel> obtenerHobbies(){
        return hobbiesService.obtenerHobbies();
    }
    
    //metodo para actualizar la word si paso el ID en el Json
    //metodo para agregar word si no paso un ID en el jSON
    @PostMapping()
    public HobbiesModel guardarHobbies(@RequestBody HobbiesModel hobbies){
        return this.hobbiesService.guardarHobbies(hobbies);
    }
    
    //metodo para eliminar word pasando word/1 1=ID del word
    @DeleteMapping ( path = "/{id}")
    public void eliminarPorId(@PathVariable("id") int id){
        this.hobbiesService.eliminarHobbies(id);        
    }
    
}
