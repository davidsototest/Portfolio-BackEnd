
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.WordModel;
import com.PDS.PDS.services.WordService;
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
@RequestMapping("/word")
public class WordController {
    
    @Autowired
    WordService wordService;
    
    //metodo para obtener la lista de word
    @GetMapping()
    public ArrayList<WordModel> obtenerWord(){
        return wordService.obtenerWord();
    }
    
    //metodo para actualizar la word si paso el ID en el Json
    //metodo para agregar word si no paso un ID en el jSON
    @PostMapping()
    public WordModel guardarWord(@RequestBody WordModel word){
        return this.wordService.guardarWord(word);
    }
    
    //metodo para eliminar word pasando word/1 1=ID del word
    @DeleteMapping ( path = "/{id}")
    public void eliminarPorId(@PathVariable("id") int id){
        this.wordService.eliminarWord(id);
    }
    
}
