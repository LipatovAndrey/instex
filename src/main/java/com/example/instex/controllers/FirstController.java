package com.example.instex.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Slf4j
public class FirstController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
      log.info("get");
      return new ResponseEntity<>("get from instex", HttpStatus.OK);
    }
}
