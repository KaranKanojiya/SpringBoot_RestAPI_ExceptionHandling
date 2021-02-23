package com.kk.springboot_restapi_exceptionhandling.Controller;


import com.kk.springboot_restapi_exceptionhandling.Exception.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    String name="Karan";
    @GetMapping("/getName")
    public  String getName()
    {
        if(name==null)
            return name;
        else
           throw new ResourceNotFoundException("Karan Not Found");

    }
}
