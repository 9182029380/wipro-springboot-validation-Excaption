package com.wipro.Propertysale.controller;

import com.wipro.Propertysale.dto.Propertydto;
import com.wipro.Propertysale.model.PropertyInfo;
import com.wipro.Propertysale.service.PropertyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {
    @Autowired
    private PropertyService service;

    @PostMapping("/addproperty")
    public ResponseEntity<PropertyInfo> saveProperty(@RequestBody  @Valid Propertydto dto){
        return new ResponseEntity<>(service.saveProperty(dto), HttpStatus.CREATED);
    }
    @GetMapping("/getproperty")
    public ResponseEntity<List<PropertyInfo>> getProperty(){
        return new ResponseEntity<>(service.getProperty(), HttpStatus.OK);
    }

}
