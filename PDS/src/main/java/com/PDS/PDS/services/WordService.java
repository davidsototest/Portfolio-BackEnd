
package com.PDS.PDS.services;

import com.PDS.PDS.models.WordModel;
import com.PDS.PDS.repository.WordRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
    
    @Autowired
    WordRepository wordRepository;
    
    //metodo que trae la lista de words
    public ArrayList<WordModel> obtenerWord(){ 
        return (ArrayList<WordModel>)wordRepository.findAll(); 
        
    }
    
    //metodo para actualizar el word, pasando el Id en el Json
    //metodo que permite agregar una education si no pasamos un Id en el Json
    public WordModel guardarWord(WordModel word){ // repositorio de guardar usuario
        return wordRepository.save(word);
    }
    
    //metodo para eliminar una education pasando el Id education/1
    public boolean eliminarWord(int id){ 
        try {
            wordRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
