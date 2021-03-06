/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.controllers.rest;

import static com.infiniteskills.mvc.controllers.rest.RestControllerTypenomerhotel._PATH17;
import com.infiniteskills.mvc.entity.Typenomerhotel;
import com.infiniteskills.mvc.repository.TypeNomerHotelRepository;
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
@RequestMapping(path = _PATH17,produces = MediaType.APPLICATION_JSON_VALUE)
public class RestControllerTypenomerhotel {
    public static final String _PATH17 = "/resttypenomerhotel";
    public static final String ITEM_PATH = "/item";
    
     private TypeNomerHotelRepository uService;
     
    @Autowired(required = false)
    public void setService(TypeNomerHotelRepository uService) {
        this.uService = uService;
    }
     
    
     @RequestMapping(method = RequestMethod.GET)
    public List<Typenomerhotel> getUnitList() {
        return uService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            path = ITEM_PATH,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Typenomerhotel createU(@RequestBody Typenomerhotel zav) {
        return uService.create(zav);
    }

    @RequestMapping(method = RequestMethod.PUT,
            path = ITEM_PATH,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Typenomerhotel updateU(@RequestBody Typenomerhotel zav) {
        return uService.update(zav);
    }

    @RequestMapping(method = RequestMethod.DELETE,
            path = ITEM_PATH,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteU(@RequestBody Typenomerhotel zav) {
        uService.delete(zav);
    }
}
