
package com.PDS.PDS.services;

import com.PDS.PDS.models.UsuarioModel;
import com.PDS.PDS.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired // hace que no tengamos cre crear una instancia, el ide ya reconoce una
    UsuarioRepository usuarioRepository; //declarado
    
    public ArrayList<UsuarioModel> obtenerUsuarios(){ // metodo consultar lista de usuarios
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll(); // son todos los metodos podibles, eliminar, crear, modificar, obtener find all
        
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario){ // repositorio de guardar usuario
        return usuarioRepository.save(usuario);
    }
    
   
    public Optional<UsuarioModel> obtenerPorId(int id){ //obtener un usuario por id
        return usuarioRepository.findById(id); // es opcional por si no existe no cause problemas.
    }
    
    public boolean eliminarUsuario(int id){ //metodo para eliminar user
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
