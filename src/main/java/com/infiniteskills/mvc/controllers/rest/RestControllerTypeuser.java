/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.controllers.rest;

import static com.infiniteskills.mvc.controllers.rest.RestControllerTypeuser._PATH18;
import com.infiniteskills.mvc.entity.Typeuser;
import com.infiniteskills.mvc.repository.TypeUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ����
 */
@RestController
@RequestMapping(path = _PATH18,produces = MediaType.APPLICATION_JSON_VALUE)
public class RestControllerTypeuser {
    public static final String _PATH18 = "/restsotrudnik";
    public static final String ITEM_PATH = "/item";
    
     private TypeUserRepository uService;
     
    @Autowired(required = false)
    public void setService(TypeUserRepository uService) {
        this.uService = uService;
    }
     
    
     @RequestMapping(method = RequestMethod.GET)
    public List<Typeuser> getUnitList() {
        return uService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            path = ITEM_PATH,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Typeuser createU(@RequestBody Typeuser zav) {
        return uService.create(zav);
    }

    @RequestMapping(method = RequestMethod.PUT,
            path = ITEM_PATH,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Typeuser updateU(@RequestBody Typeuser zav) {
        return uService.update(zav);
    }

    @RequestMapping(method = RequestMethod.DELETE,
            path = ITEM_PATH,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteU(@RequestBody Typeuser zav) {
        uService.delete(zav);
    }
}
