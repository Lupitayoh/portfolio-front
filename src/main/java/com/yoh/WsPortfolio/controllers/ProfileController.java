package com.yoh.WsPortfolio.controllers;

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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity profile() {
        HashMap<String, String> response = new HashMap<String, String>();
        response.put("message", "Bienvenido a Spring 5");
        return new ResponseEntity<HashMap>(response, HttpStatus.OK);
    }

}
