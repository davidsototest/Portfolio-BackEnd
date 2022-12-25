
package com.backEndPortfolioDS.backEndPortfolioDS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backEndPortfolioDS.backEndPortfolioDS.developer.Developer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/demo")
public class Controller {
    
    @RequestMapping(value="/dev", method = RequestMethod.GET)
    public Developer obtdev(HttpServletRequest request){
        
        Developer devel = new Developer();
        devel.setName("david soto");
        devel.setDireccion("montevideo 400");
        
        return devel;
    }
    
    @GetMapping("/test")
    public String test(){
        return "prueba para validar consultas get";
    }
    
}
