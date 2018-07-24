package com.yoh.WsPortfolio.controllers;

import com.yoh.WsPortfolio.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/profile")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity profile() {
        HashMap<String, Object> response = new HashMap<String, Object>();
        response.put("owner", customerService.getCustomer(1L));
        return new ResponseEntity<HashMap>(response, HttpStatus.OK);
    }

}
