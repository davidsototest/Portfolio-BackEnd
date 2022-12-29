
package com.PDS.PDS.controllers;

import com.PDS.PDS.models.UsuarioModel;
import com.PDS.PDS.services.UsuarioService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService; //instancia 
    
    //este metodo debe borrarse al final de todo
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    
    //metodo para actualizar user, solo debo pasar el ID 1
    //metodo para crear user, si no paso ID creo un user new
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }
    
    //metodo para consultar el user, pasando el ID usuario/1
    @GetMapping ( path = "/{id}") //pasar el id para obtener ese user
    public Optional<UsuarioModel>  obtenerUsuarioPorId(@PathVariable("id") int id){ //obtienes el usuario de esde id
        return this.usuarioService.obtenerPorId(id);
    }
    
    
    //este metodo debe borrarse al final de todo
    @DeleteMapping ( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "se elimino el user con id: " + id;
        } else{
            return "No pudo eliminar el user con id: " + id;
        }
    }
}
