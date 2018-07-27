package com.yoh.WsPortfolio.controllers;

import com.yoh.WsPortfolio.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/profile")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    /**@author Lupitayoh
     * Return the owner information for about page
     * and general information
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity profile(@PathVariable("id") Long id) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        response.put("owner", customerService.getCustomer(id));
        return new ResponseEntity<HashMap>(response, HttpStatus.OK);
    }

}
