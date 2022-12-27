
package com.PDS.PDS.services;

import com.PDS.PDS.models.UsuarioModel;
import com.PDS.PDS.repository.UsuarioRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsuarios(){ // metodo consultar lista de usuarios
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll(); // son todos los metodos podibles, eliminar, crear, modificar, obtener find all
        
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario){ // repositorio de guardar usuario
        return usuarioRepository.save(usuario);
    }
}
