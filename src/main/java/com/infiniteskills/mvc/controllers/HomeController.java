package com.infiniteskills.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.entity.Department;
import com.infiniteskills.mvc.entity.Hotel;
import com.infiniteskills.mvc.entity.Sotrudnik;
import com.infiniteskills.mvc.entity.Typeza;
import com.infiniteskills.mvc.repository.DepartmentRepository;
import com.infiniteskills.mvc.repository.HotelRepository;
import com.infiniteskills.mvc.repository.SotrudnikRepository;
import com.infiniteskills.mvc.repository.TypeZayavkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {

    private DepartmentRepository DepartmentRepository;
    private HotelRepository hotelRepository;
    private TypeZayavkaRepository typZ;
    private SotrudnikRepository sotrRepository;

    @Autowired(required = false)
    public void setDepRepository(DepartmentRepository progDAO) {
        this.DepartmentRepository = progDAO;
    }
    
     @Autowired(required = false)
    public void setHotelRepository(HotelRepository hotDAO) {
        this.hotelRepository = hotDAO;
    }
    
    @Autowired(required = false)
    public void setTypeZRepository(TypeZayavkaRepository typeZ) {
        this.typZ = typeZ;
    }
    
    @Autowired(required = false)
    public void setSotrudnikRepository(SotrudnikRepository sotr) {
        this.sotrRepository = sotr;
    }
    

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String deptList(Model model) {

        List<Department> list = DepartmentRepository.findAll();
        for (Department dept : list) {
            System.out.println("Dept No " + dept.getDeptNo());
        }
        model.addAttribute("departments", list);
        return "corporative/home";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String ordersList(ModelMap model) {
        
        List<Hotel> lsHotel = hotelRepository.findAll();
        for (Hotel dept : lsHotel) {
            System.out.println("name " + dept.getName());
        }
        List<Typeza> lsTypeZ = typZ.findAll();
        
        List<Sotrudnik> lsSotr = sotrRepository.findAll();

        model.addAttribute("listHotel", lsHotel);
        model.addAttribute("listTypeZ", lsTypeZ);
        model.addAttribute("listSotr",lsSotr);
        
        return "corporative/orders";
    }
    
    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public String hotelList(ModelMap model) {
     return "corporative/hotels";
    }
    
    
}
