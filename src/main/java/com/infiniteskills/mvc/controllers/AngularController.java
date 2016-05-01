package com.infiniteskills.mvc.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infiniteskills.mvc.entity.Department;
import com.infiniteskills.mvc.helpclasses.Data;
import com.infiniteskills.mvc.repository.DepartmentRepository;





@RestController
public class AngularController {
	
	
	private DepartmentRepository departmentDAO;          

	
//-------------------Retrieve All department--------------------------------------------------------	
@RequestMapping(value="/getdepartment",method=RequestMethod.GET)
public ResponseEntity<List<Department>> deptList(Model model) {
	    List<Department> list = departmentDAO.findAll();
	    
	    for (Department dept : list) {
	        System.out.println("Dept No " + dept.getDeptNo());
	    }
	    
	    if(list.isEmpty()){
            return new ResponseEntity<List<Department>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Department>>(list, HttpStatus.OK);	 
	}


@RequestMapping(path="/isfree",method=RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Data> isFreeNumber(@RequestBody Data dat) {

	System.out.println("All in ass");
	
return new ResponseEntity<Data>(dat, HttpStatus.OK);

}



	
	
}
